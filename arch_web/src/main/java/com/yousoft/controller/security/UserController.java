package com.yousoft.controller.security;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.yousoft.controller.common.AbstractArchController;
import com.yousoft.model.security.TSysuser;
import com.yousoft.model.security.view.AddUserModel;
import com.yousoft.model.security.view.SessionUser;
import com.yousoft.service.security.UserService;
import com.yousoft.service.util.ArchState;

@RestController
@Scope("prototype")
public class UserController extends AbstractArchController {
	/** 日志记录对象. **/
	private static Logger logger = LoggerFactory
			.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/user/addUser", method = RequestMethod.POST)
	@ResponseBody
	public Object addUser(@RequestBody AddUserModel addUserModel,
			HttpServletRequest request, HttpServletResponse response) {
		if (addUserModel != null
				&& StringUtils.isNotEmpty(addUserModel.getLogincode())) {
			SessionUser currentUser = getCurrentUser(request);
			if (currentUser != null) {
				long userid = currentUser.getUserId();
				int result = userService.addUser(addUserModel,
						addUserModel.getRoleidlist(),
						addUserModel.getLogincode(), userid);
				if (result == ArchState.SUCCESS.getState()) {
					return success("用户添加成功");
				} else {
					return error("用户添加失败");
				}
			} else {
				return error("用户没有登录");
			}
		} else {
			return error("提交数据的格式不正确");
		}
	}

	@RequestMapping(value = "/user/queryUser/{method}/{value}", method = RequestMethod.POST)
	public Object findUser(@PathVariable String method,
			@PathVariable String value) {
		if (StringUtils.isNotEmpty(method) && StringUtils.isNotEmpty(value)) {
			if (UserService.DEPART.equals(method)
					|| UserService.USERID.equals(method)) {
				// 按部门进行数据查询
				try {
					Integer.valueOf(value);
				} catch (Exception ex) {
					logger.error(ExceptionUtils.getFullStackTrace(ex));
					if (UserService.DEPART.equals(method))
						return error("部门ID格式不正确");
					else
						return error("用户ID格式不正确");
				}
			}
			List<TSysuser> userList = userService.findUserByMethodAndValue(
					method, value);
			if (userList == null || userList.size() == 0) {
				return error("没有查询到满足条件的数据");
			} else if (userList.size() == 1) {
				return success(userList.get(0));
			} else {
				return success(userList);
			}
		} else {
			return error("传入的参数不正确");
		}
	}
	
	

}
