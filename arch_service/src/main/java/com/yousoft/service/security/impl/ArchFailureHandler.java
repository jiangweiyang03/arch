package com.yousoft.service.security.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

public class ArchFailureHandler implements AuthenticationFailureHandler {
	/** 日志对象. **/
	private static Logger logger = LoggerFactory
			.getLogger(ArchFailureHandler.class);
	/** 重定向处理对象. **/
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	/** 默认定向页面 **/
	private String defaultUrl;

	@SuppressWarnings("deprecation")
	@Override
	public void onAuthenticationFailure(HttpServletRequest request,
			HttpServletResponse response, AuthenticationException exception)
			throws IOException, ServletException {
		logger.info("user : "+exception.getAuthentication().getName() + " login failure");
		request.setAttribute("error_reason", exception.getMessage());
		redirectStrategy.sendRedirect(request, response, defaultUrl);
	}

	public String getDefaultUrl() {
		return defaultUrl;
	}

	public void setDefaultUrl(String defaultUrl) {
		this.defaultUrl = defaultUrl;
	}

}
