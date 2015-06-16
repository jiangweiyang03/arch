package com.yousoft.service.security.impl;

import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;

@Component
public class ArchAccessDecisionManager implements AccessDecisionManager {

	@Override
	public void decide(Authentication authentication, Object object,
			Collection<ConfigAttribute> configAttributes)
			throws AccessDeniedException, InsufficientAuthenticationException {

		if (configAttributes == null) {
			return;
		}
		// 所请求的资源拥有的权限(一个资源对多个权限)
		Iterator<ConfigAttribute> iterator = configAttributes.iterator();
		ConfigAttribute configAttribute = null;
		String needPermission = null;
		String[] authorityArray = null;
		String role = null;
		String grantAuthorityStr = null;
		while (iterator.hasNext()) {
			configAttribute = iterator.next();
			// 访问所请求资源所需要的权限
			needPermission = configAttribute.getAttribute();
			if (StringUtils.isNotEmpty(needPermission)) {
				// 通过_对权限数据进行分割
				authorityArray = needPermission.split("_");
				System.out.println("needPermission is " + needPermission);
				// 用户所拥有的权限authentication
				if (authorityArray != null && authorityArray.length == 2) {
					role = authorityArray[0];// 角色信息 1 为权限信息
					for (GrantedAuthority grantedAuthority : authentication
							.getAuthorities()) {
						grantAuthorityStr = grantedAuthority.getAuthority();
						if (role.equals(grantAuthorityStr)) {
							return;
						}
					}
				} else {
					throw new AccessDeniedException("当前请求的权限配置错误");
				}
			} else {
				return;
			}

		}
		throw new AccessDeniedException(" 没有权限访问");
	}

	@Override
	public boolean supports(ConfigAttribute attribute) {
		return true;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

}
