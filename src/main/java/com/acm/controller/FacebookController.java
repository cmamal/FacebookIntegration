package com.acm.controller;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FacebookController {

	private static final String FB_LOGIN = "fblogin";
	private final static org.slf4j.Logger logger = LoggerFactory.getLogger(FacebookController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String fbLogin(ModelMap model)  {

		logger.debug("[fbLogin] ");
		return FB_LOGIN;

	}

}