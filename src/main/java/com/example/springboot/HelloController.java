package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

	@RequestMapping("/")
	public String index(@RequestParam(value="username", defaultValue="everyone") String username)  {
		return String.format("Greetings %s from Spring Boot + Tanzu!",username);
	}

}