package com.yousoft.service.security.impl;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import com.yousoft.service.util.ResponseUtil;

public class ArchFailureHandler implements AuthenticationFailureHandler {
	/**日志对象.**/
	private static Logger logger = LoggerFactory.getLogger(ArchFailureHandler.class);

	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		logger.info(exception.getMessage());
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("userid", 1);
		map.put("reason", exception.getMessage());
		response.getWriter().write(ResponseUtil.exception(map).toString());
	}

}
