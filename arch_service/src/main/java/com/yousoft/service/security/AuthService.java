package com.yousoft.service.security;

import com.yousoft.model.security.view.SecurityUser;

public interface AuthService {
	/**
	 * 根据登录代码查询
	 * @param loginCode
	 * @return
	 */
	public SecurityUser findSecurityUserByLoginCode(String loginCode);
	
	
}
