package com.yousoft.controller.security;

import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RestController;

import com.yousoft.controller.common.AbstractArchController;

@RestController
@Scope("prototype")
public class RoleController extends AbstractArchController {

}
