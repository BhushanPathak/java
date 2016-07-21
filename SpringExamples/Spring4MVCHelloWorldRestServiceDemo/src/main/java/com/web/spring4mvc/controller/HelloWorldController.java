package com.web.spring4mvc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.web.spring4mvc.domain.Message;

@RestController
public class HelloWorldController {

	@RequestMapping("/")
	public String welcome(){
		return "Welcome to Rest Template Example";
	}
	
	@RequestMapping("/hello/{player}")
	public Message message(@PathVariable String player){
		Message msg = new Message(player, "Hello " + player);
		return msg;
	}
}
