package com.yousoft.service.security.impl;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yousoft.client.security.TSysuserauthMapper;
import com.yousoft.model.security.view.SecurityUser;
import com.yousoft.service.security.AuthService;

@Service
public class AuthServiceImpl implements AuthService {
	
	private static Logger logger = LoggerFactory.getLogger(AuthServiceImpl.class);
	
	@Autowired
	private TSysuserauthMapper authMapper;

	public SecurityUser findSecurityUserByLoginCode(String loginCode) {
		if (StringUtils.isNotEmpty(loginCode)) {
			logger.info("loginCode:"+loginCode);
			return authMapper.findSecurityUserByLoginCode(loginCode);
		} else {
			return null;
		}
	}

}
