package com.yousoft.controller.security;

import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yousoft.service.process.ProcessService;
import com.yousoft.service.security.ResourceService;
import com.yousoft.service.util.ResponseUtil;

@RestController
@Scope("prototype")
public class ProcessController {
	@Autowired
	private ProcessService processService;
	@Autowired
	private ResourceService resourceService;
	
	public ProcessController(){
		Assert.isNull(processService, "processService is null");
	}
	
	@RequestMapping("/createProcess")
	public Object createProcess() {
		try {
			return ResponseUtil.success(processService.createProcessByClasspath("process\\NewFile2.xml"));
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseUtil.exception(ExceptionUtils.getFullStackTrace(e));
		}
	}

}
