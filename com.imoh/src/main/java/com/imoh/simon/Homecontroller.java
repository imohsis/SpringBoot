package com.imoh.simon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

	@RequestMapping("/hello")
	public String index(){
		return "Welcome to SpringBoot";
		
	}
	
	
}
