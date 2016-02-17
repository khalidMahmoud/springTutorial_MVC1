package com.khalid.springTutorial_MVC1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OffersController {
	@RequestMapping("/")
	public String showIndex(){
		return "index";
	}

}
