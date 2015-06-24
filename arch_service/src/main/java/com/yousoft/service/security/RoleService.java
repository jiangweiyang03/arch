package com.yousoft.service.security;

import com.yousoft.model.security.TSysrole;

public interface RoleService {
	
	/**
	 * 添加角色信息
	 * @param role  角色对象
	 * @param operatorCode 操作人员代码
	 * @return 是否成功添加
	 */
	public int addRole(TSysrole role,Long operatorCode);
	
	/**
	 * 修改角色信息
	 * @param role 角色对象
	 * @param operatorCode	操作人员代码
	 * @return  是否修改成功
	 */
	public int modifyRole(TSysrole role,Long operatorCode);
	
	/**
	 * 删除角色信息
	 * @param role  角色对象
	 * @return  是否删除成功
	 */
	public int deleteRole(TSysrole role);


}
