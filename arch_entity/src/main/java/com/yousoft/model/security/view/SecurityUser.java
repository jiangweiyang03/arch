package com.yousoft.model.security.view;

/**
 * 用户验证查询对象信息
 * @author jiangweiyang01
 * @version 1.0
 * @since 2015/06/04
 */
public class SecurityUser {
	
	private int userId;
	
	private String userName;
	
	private String userPass;
	
	private int status;//帐号状态
	
	private int valid;//有效状态
	
	public SecurityUser() {
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getValid() {
		return valid;
	}

	public void setValid(int valid) {
		this.valid = valid;
	}
	
}
