package com.yousoft.model.security.view;

import java.util.List;

import com.yousoft.model.security.TSysuser;

public class AddUserModel extends TSysuser {
	/** 登录代码 **/
	private String logincode;
	/** 赋值角色集合 **/
	private List<Integer> roleidlist;

	/**
	 * @return the logincode
	 */
	public String getLogincode() {
		return logincode;
	}

	/**
	 * @param logincode
	 *            the logincode to set
	 */
	public void setLogincode(String logincode) {
		this.logincode = logincode;
	}

	/**
	 * @return the roleidlist
	 */
	public List<Integer> getRoleidlist() {
		return roleidlist;
	}

	/**
	 * @param roleidlist
	 *            the roleidlist to set
	 */
	public void setRoleidlist(List<Integer> roleidlist) {
		this.roleidlist = roleidlist;
	}
	
}
