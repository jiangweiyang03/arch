package com.yousoft.controller.common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.yousoft.model.security.view.MenuTreeNode;
import com.yousoft.model.security.view.SessionUser;
import com.yousoft.service.security.MenuService;

/**
 * 定义首页跳转处理Controller
 * 
 * @author jiangweiyang01
 * @since 2015.06.22
 * @version 1.0
 */
@Controller
public class HomeController extends AbstractArchController {
	/** 日志处理工具. **/
	private static Logger logger = LoggerFactory
			.getLogger(HomeController.class);
	@Autowired
	private MenuService menuService;

	/**
	 * 定义首页重定向页面
	 * 
	 * @return 首页重定向办面
	 */
	@RequestMapping("/home")
	public ModelAndView main(HttpServletRequest request,
			HttpServletResponse response) {
		Map<String, Object> paramMap = new HashMap<String, Object>();
		SessionUser user = super.getCurrentUser(request);
		if (user != null) {
			paramMap.put("CurrentUser", user.getUserName());
		}
		ModelAndView mv = new ModelAndView("/WEB-INF/main.jsp", paramMap);
		return mv;
	}

	/**
	 * 根据当前登录用户返回该用户的菜单信息
	 * 
	 * @return 菜单对应的格式字符串
	 */
	@RequestMapping(value = "/findmenubyperson", method = RequestMethod.POST)
	@ResponseBody
	public Object findUserMenuByCurrentSession(HttpServletRequest request,
			HttpServletResponse response) {
		SessionUser sessionUser = super.getCurrentUser(request);
		if (sessionUser != null) {
			/** 根据用户ID查询该用户可以查看的系统菜单. **/
			List<MenuTreeNode> nodeList = menuService.findMenuByUserId(sessionUser.getUserId());
			if (nodeList != null && nodeList.size() > 0) {
				return nodeList;
			} else {
				return error("没有查询到用户的菜单信息");
			}
		} else {
			return error("当前用户没有登录,请重新操作");
		}
	}

}
