package com.yousoft.model.security.view;

import java.util.List;

import com.yousoft.model.security.TSysuser;

public class SessionUser {
	/** 用户ID. **/
	private Long userId;
	/** 用户姓名. **/
	private String userName;
	/** 所在部门. **/
	private int departId;
	/** 配置的角色集合. **/
	private List<Integer> roleIdList;

	/** 默认构造函数. **/
	public SessionUser() {
	}

	/** 通过系统用户对象构建SessionUser对象. **/
	public SessionUser(TSysuser sysUser) {
		if (sysUser != null) {
			this.userId = sysUser.getUserid();
			this.userName = sysUser.getUsername();
			this.departId = sysUser.getDepartid();
		}
	}

	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}

	/**
	 * @param userId
	 *            the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName
	 *            the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the departId
	 */
	public int getDepartId() {
		return departId;
	}

	/**
	 * @param departId
	 *            the departId to set
	 */
	public void setDepartId(int departId) {
		this.departId = departId;
	}

	/**
	 * @return the roleIdList
	 */
	public List<Integer> getRoleIdList() {
		return roleIdList;
	}

	/**
	 * @param roleIdList
	 *            the roleIdList to set
	 */
	public void setRoleIdList(List<Integer> roleIdList) {
		this.roleIdList = roleIdList;
	}
}
