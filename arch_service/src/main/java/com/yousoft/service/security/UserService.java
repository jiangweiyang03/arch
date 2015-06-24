package com.yousoft.service.security;

import java.util.List;

import com.yousoft.model.security.TSysuser;

public interface UserService {

	/** 按部门查询 **/
	public static String DEPART = "depart";
	/** 根据userid查询 **/
	public static String USERID = "userid";
	/** 根据姓名查询 **/
	public static String USERNAME = "username";

	/**
	 * 根据用户ID获取该用户的权限信息
	 * 
	 * @param userid
	 * @return
	 */
	public List<Integer> findRoleIDListByUserId(long userid);

	/**
	 * 添加用户对象信息,并赋值角色信息.
	 * 
	 * @param sysUser
	 *            需持久化的用户对象信息
	 * @param roleIdList
	 *            角色ID集合
	 * @param loginCode
	 *            登录Code
	 * @parm operatorCode 操作者ID
	 * @return 用户添加是否成功
	 */
	public int addUser(TSysuser sysUser, List<Integer> roleIdList,
			String loginCode, Long operatorCode);
	
	/**
	 * 更新用户对象信息及相应的角色信息.
	 * @param sysUser 需更新的用户对象信息
	 * @param roleIdList 更新之后的角色ID集合
	 * @param loginCode 登录Code
	 * @param operatorCode 操作者ID
	 * @return 修改信息是否成功
	 */
	public int modifyUser(TSysuser sysUser,List<Integer> roleIdList,
			String loginCode,Long operatorCode);
	
	

	/**
	 * 根据用户ID查询用户对象.
	 * 
	 * @param userId
	 *            用户编号ID
	 * @return
	 */
	public TSysuser findUserByUserId(long userId);

	/**
	 * 根据方法以及用户信息查询满足条件的用户对象集合
	 * 
	 * @param method
	 *            查询方法
	 * @param value
	 *            查询值
	 * @return 用户集合
	 */
	public List<TSysuser> findUserByMethodAndValue(String method, String value);

}
