package com.yousoft.service.security.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.stereotype.Service;

import com.yousoft.client.security.TSysroleresourceMapper;
import com.yousoft.model.security.view.ResRoleModel;
import com.yousoft.service.security.ResourceService;

@Service
public class ResourceServiceImpl implements ResourceService {
	/** 日志记录对象. **/
	private static Logger logger = LoggerFactory
			.getLogger(ResourceServiceImpl.class);
	@Autowired
	private TSysroleresourceMapper sysRoleResMapper;

	@Override
	public Map<String, Collection<ConfigAttribute>> findResourceRoleMap()
			throws RuntimeException {
		// 提取系统中目前配置的角色
		List<ResRoleModel> resRoleModelList = sysRoleResMapper
				.findAllResRoleModel();
		/** 遍历集合数据m **/
		String resUrl = null;
		Map<String, Collection<ConfigAttribute>> authMap = new HashMap<String, Collection<ConfigAttribute>>();
		if (resRoleModelList != null && resRoleModelList.size() > 0) {
			Collection<ConfigAttribute> athorityArray = null;
			SecurityConfig securityConfig = null;
			for (ResRoleModel resRoleModel : resRoleModelList) {
				if (resRoleModel != null) {
					resUrl = resRoleModel.getResUrl();// 获取请求URL
					if (StringUtils.isNotEmpty(resUrl)) {
						if (authMap.get(resUrl) != null) {
							athorityArray = authMap.get(resUrl);
						} else {
							athorityArray = new ArrayList<ConfigAttribute>();
						}
						/** 将角色与访问权限均作为构造数据进行处理 **/
						securityConfig = new SecurityConfig(
								"ROLE_".concat(
										String.valueOf(resRoleModel.getRoleId()))
										.concat("_")
										.concat(String.valueOf(resRoleModel
												.getAuthority())));
						// 权限集合中加入权限配置数据
						athorityArray.add(securityConfig);
						authMap.put(resUrl, athorityArray);
					} else {
						logger.warn("resurl is empty:" + resRoleModel);
					}
				}
			}
		}
		return authMap;
	}

}
