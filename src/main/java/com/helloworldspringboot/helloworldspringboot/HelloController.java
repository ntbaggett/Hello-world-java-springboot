package com.helloworldspringboot.helloworldspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping("/")
	public String index () {
		return "Hello World. Welcome to Java/Springboot";
	}

}
