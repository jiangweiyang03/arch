package com.yousoft.controller.security;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yousoft.controller.common.AbstractArchController;
import com.yousoft.model.security.view.DepartTreeNode;
import com.yousoft.model.security.view.SessionUser;
import com.yousoft.service.security.DepartService;

@RestController
@Scope("prototype")
public class DepartController extends AbstractArchController {
	/** 日志logger对象 **/
	private static Logger logger = LoggerFactory
			.getLogger(DepartController.class);
	@Autowired
	private DepartService departService;

	@RequestMapping("/security/depart")
	public ModelAndView depart() {
		ModelAndView mv = new ModelAndView("/WEB-INF/security/depart.jsp");
		return mv;
	}

	@RequestMapping("/security/depart/findDepartTreeNodeByPerson")
	@ResponseBody
	public Object findDepartTreeNodeByPerson(HttpServletRequest request,
			HttpServletResponse response) {
		logger.info("根据当前用户查询机构树信息...");
		SessionUser user = super.getCurrentUser(request);
		List<DepartTreeNode> departList = departService
				.findDepartTreeByUserIdAndDepartId(user.getUserId(),
						user.getDepartId());
		if (departList != null) {
			if (departList.size() > 1) {
				// 返回机构列表集合
				return departList;
			} else if (departList.size() == 1){
				// 返回单个
				return departList.get(0);
			} else {
				return error("没有查询到满足条件部门数据");
			}
		} else {
			return error("没有查询到满足条件的数据");
		}
	}

}
