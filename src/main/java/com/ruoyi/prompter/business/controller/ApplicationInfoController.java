package com.ruoyi.prompter.business.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ruoyi.prompter.business.common.Status;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/msprompter/api")
@Api(value = "msprompter",description = "msprompter")
public class ApplicationInfoController {
	
	
	@RequestMapping(method = RequestMethod.GET,value = "/admin/v1/hello")
    @ApiOperation(value = "hello", httpMethod = "GET", notes = "hello")
    public Status<String> cstnAi(){
		System.out.println("http success ! hello msprompter!!!!");
		return new Status<String>().success("hello msprompter!!!!");
	}
}
