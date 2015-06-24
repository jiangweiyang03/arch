package com.yousoft.controller.security;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.yousoft.model.security.view.AddUserModel;
import com.yousoft.model.security.view.SessionUser;
import com.yousoft.service.util.ArchState;

@RestController
@Scope("prototype")
public class DepartController {
	
	@RequestMapping("/security/depart")
	public ModelAndView depart(){
		ModelAndView mv = new ModelAndView("/WEB-INF/security/depart.jsp");
		return mv;
	}
	
}
