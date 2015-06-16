package com.yousoft.service.security.impl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class ArchSuccessHandler implements AuthenticationSuccessHandler {
	/** 日志记录对象. **/
	private static Logger logger = LoggerFactory
			.getLogger(ArchSuccessHandler.class);
	/** 重定向处理对象. **/
	private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();
	/** 默认定向页面 **/
	private String defaultUrl;

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request,
			HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		logger.info("userName : " + authentication.getName() + " login success");
		redirectStrategy.sendRedirect(request, response, defaultUrl);
	}

	public String getDefaultUrl() {
		return defaultUrl;
	}

	public void setDefaultUrl(String defaultUrl) {
		this.defaultUrl = defaultUrl;
	}

}
