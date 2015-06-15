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
	
	private String passWord;
	
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

	/**
	 * @return the passWord
	 */
	public String getPassWord() {
		return passWord;
	}

	/**
	 * @param passWord the passWord to set
	 */
	public void setPassWord(String passWord) {
		this.passWord = passWord;
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
