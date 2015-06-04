package com.yousoft.service.security.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yousoft.client.security.TSysuserauthMapper;
import com.yousoft.model.security.view.SecurityUser;
import com.yousoft.service.security.AuthService;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired
	private TSysuserauthMapper authMapper;

	@Override
	public SecurityUser findSecurityUserByLoginCode(String loginCode) {
		return authMapper.findSecurityUserByLoginCode(loginCode);
	}

}
