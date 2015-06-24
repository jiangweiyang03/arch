package com.yousoft.controller.security;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TextController {
	
	@RequestMapping(value = "/test/app", method = RequestMethod.POST)
	@ResponseBody
	public Object app(HttpServletRequest request,HttpServletResponse response){
		System.out.println("1234");
		Map<String,Object> map = new HashMap<String,Object>();
		map.put("status", true);
		map.put("key", "OK");
		return map;
	}

}
