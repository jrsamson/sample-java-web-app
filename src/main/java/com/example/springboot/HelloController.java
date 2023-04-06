package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class HelloController {

	@RequestMapping("/")
	//public String hello(@RequestParam(value = "name", defaultValue = "") String name) {
	public String index(@RequestParam(value="name", defaultValue="") String name)  {
		return String.format("Greetings %s from Spring Boot + Tanzu!",name);
		//return String.format("Hello %s!", name);
	}

}