package com.microservice2.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	
	@RequestMapping("getCode")
	public String getCode() {
		
		return "Success Code";
	}
}
