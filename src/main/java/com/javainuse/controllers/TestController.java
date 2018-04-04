package com.javainuse.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}

}
