package com.yousoft.model.security.view;

/**
 * 资源角色对应关联Model
 * @author jiangweiyang01
 * @since 2015/06/14
 * @version 1.0
 */
public class ResRoleModel {
	/**请求url.**/
	private String resUrl;
	/**角色ID.**/
	private int roleId;
	/**权限信息.**/
	private int authority;
	/**
	 * @return the resUrl
	 */
	public String getResUrl() {
		return resUrl;
	}
	/**
	 * @param resUrl the resUrl to set
	 */
	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}
	/**
	 * @return the roleId
	 */
	public int getRoleId() {
		return roleId;
	}
	/**
	 * @param roleId the roleId to set
	 */
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	/**
	 * @return the authority
	 */
	public int getAuthority() {
		return authority;
	}
	/**
	 * @param authority the authority to set
	 */
	public void setAuthority(int authority) {
		this.authority = authority;
	}
	@Override
	public String toString() {
		return "ResRoleModel [resUrl=" + resUrl + ", roleId=" + roleId
				+ ", authority=" + authority + "]";
	}
}
