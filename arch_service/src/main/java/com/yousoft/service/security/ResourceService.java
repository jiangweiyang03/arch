package com.yousoft.service.security;

import java.util.Collection;
import java.util.Map;

import org.springframework.security.access.ConfigAttribute;

import com.yousoft.model.security.TSysresources;

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
	
	/**
	 * 往资源信息表中添加对象
	 * @param resource 资源对象
	 * @return 添加资源是否成功
	 */
	public int addResources(TSysresources resource,Long operatorCode);
	
	
	/**
	 * 修改资源信息
	 * @param resource 资源对象
 	 * @param operatorCode 操作者ID
	 * @return 资源是否修改成功
	 */ 
	public int updateResources(TSysresources resource, Long operatorCode);
	

}
