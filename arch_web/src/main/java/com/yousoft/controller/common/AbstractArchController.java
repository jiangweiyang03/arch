package com.yousoft.controller.common;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.yousoft.model.security.view.SessionUser;

/***
 * 抽象控制器
 * 
 * @author jiangweiyang01
 * @version 1.0
 * @since
 */
public abstract class AbstractArchController {
	/** 当前用户对象 **/
	public static final String CURRENTUSER = "currentuser";

	/**
	 * 封装返回的参数信息
	 * 
	 * @param value
	 *            封装result结果信息
	 * @return 返回到前端的结果封装体
	 */
	public Object success(Object value) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("status", "0");
		resultMap.put("result", value);
		return resultMap;
	}
	

	/**
	 * 封装返回的参数信息
	 * 
	 * @param value
	 *            封装result结果信息
	 * @return 返回至前端的结果封装体
	 */
	public Object error(Object value) {
		Map<String, Object> resultMap = new HashMap<String, Object>();
		resultMap.put("status", 1);
		resultMap.put("result", value);
		return resultMap;
	}

	/***
	 * 获取当前请求中的用户对象
	 * 
	 * @param request
	 *            访问请求对象.
	 * @return
	 */
	public SessionUser getCurrentUser(HttpServletRequest request) {
		if (request != null && request.getSession() != null
				&& request.getSession().getAttribute(CURRENTUSER) != null) {
			/** 获取session中当前用户对象. **/
			SessionUser sessionUser = (SessionUser) request.getSession()
					.getAttribute(CURRENTUSER);
			if (sessionUser != null) {
				return sessionUser;
			}
		}
		return null;
	}

}
