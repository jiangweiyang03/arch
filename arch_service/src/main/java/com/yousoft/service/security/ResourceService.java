package com.yousoft.service.security;

import java.util.Collection;
import java.util.Map;

import org.springframework.security.access.ConfigAttribute;

/**
 * 资源接口
 * @author jiangweiyang01
 * @version 1.0
 * @since 2015/06/04
 */
public interface ResourceService {
	/**
	 * 加载所有资源与角色的映射关系信息
	 * @return
	 * @throws RuntimeException
	 */
	public Map<String, Collection<ConfigAttribute>> findResourceRoleMap() throws RuntimeException;

}
