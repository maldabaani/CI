package com.gateway.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Controller {

	
	@RequestMapping("getewayTest")
	public String getewayTest() {
		
		return "Success getewayTest";
	}
}