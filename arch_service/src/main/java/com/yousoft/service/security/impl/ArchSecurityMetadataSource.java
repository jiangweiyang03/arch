package com.yousoft.service.security.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import com.yousoft.service.security.ResourceService;
import com.yousoft.service.util.ArchConstants;
import com.yousoft.service.util.CacheService;

@Service("archSecurityMetadataSource")
public class ArchSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
	/** 日志记录对象 **/
	private static Logger logger = LoggerFactory
			.getLogger(ArchSecurityMetadataSource.class);
	@Autowired
	private CacheService cacheService;
	/**权限角角映射关系**/
	private static Map<String, Collection<ConfigAttribute>> resourceMap = null;
	@Autowired
	private ResourceService resourceService;
	
	@Override
	public Collection<ConfigAttribute> getAttributes(Object object)
			throws IllegalArgumentException {
		// 获取用户提交的请求URL
		String requestUrl = ((FilterInvocation) object).getRequestUrl();
		if (StringUtils.isNotEmpty(requestUrl)) {
			logger.info("Request URL:" + requestUrl);
			if (resourceMap == null) {
				loadResourceDefine();
			}
			if (resourceMap != null) {
				return resourceMap.get(requestUrl);
			} else {
				return null;
			}
		}
		return null;
	}

	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return new ArrayList<ConfigAttribute>();
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

	// 加载所有资源与权限的关系
	@SuppressWarnings("unchecked")
	private void loadResourceDefine() throws RuntimeException {
		if (resourceMap == null && cacheService != null) {
			resourceMap = (Map<String, Collection<ConfigAttribute>>)cacheService.getCacheValue(ArchConstants.CACHE_RESOURCEMAP);//先从缓存中获取数据
		}
		if (resourceMap == null && resourceService != null) {
			//缓存数据中没有数据,从数据库中获取资源与角色的对应关系.
			logger.info("findResourceRoleMap");
			Assert.isNull(resourceService,"当前resourceService is null");
			resourceMap = resourceService.findResourceRoleMap();
		}
		if (resourceMap == null || resourceMap.size()==0) {
			logger.error("没有获取到资源与角色的映射信息");
		}
	}

}
