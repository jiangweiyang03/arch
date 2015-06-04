package com.yousoft.service.security.impl;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;

/**
 * spring security 拦截器用于判断当前用户是否有权限进入
 * @author jiangweiyang01
 * @version 1.0
 * @since 2015/06/04
 */
public class ArchSecurityFilter extends AbstractSecurityInterceptor implements Filter {
	
	/**用户元数据信息**/
	private FilterInvocationSecurityMetadataSource securityMetadataSource; 
	
	public FilterInvocationSecurityMetadataSource getSecurityMetadataSource() {
		return securityMetadataSource;
	}

	public void setSecurityMetadataSource(
			FilterInvocationSecurityMetadataSource securityMetadataSource) {
		this.securityMetadataSource = securityMetadataSource;
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		FilterInvocation fi = new FilterInvocation(request, response, chain);  
        invoke(fi);  
	}
	
	private void invoke(FilterInvocation fi)  throws IOException, ServletException {
		// object为FilterInvocation对象  
        // super.beforeInvocation(fi);//源码  
        // 1.获取请求资源的权限  
         //执行 Collection<ConfigAttribute> attributes =   
                        //securityMetadataSource.getAttributes(fi);  
        // 2.是否拥有权限  
        // this.accessDecisionManager.decide(authenticated, fi, attributes);  
        // this.accessDecisionManager.decide(authenticated, fi, attributes);  
        InterceptorStatusToken token = super.beforeInvocation(fi);  
        try {  
            fi.getChain().doFilter(fi.getRequest(), fi.getResponse());  
        } finally {  
            super.afterInvocation(token, null);  
        }  
	}

	@Override
	public void destroy() {

	}

	@Override
	public Class<?> getSecureObjectClass() {
		return FilterInvocation.class;
	}

	@Override
	public SecurityMetadataSource obtainSecurityMetadataSource() {
		return this.securityMetadataSource;
	}

}
