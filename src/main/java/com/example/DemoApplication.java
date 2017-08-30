package com.example;

import com.example.action.TemplateController;
import com.example.action.TestAction;
import com.example.action.UserAction;
import com.example.action.UserNGAction;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@EnableAutoConfiguration
@SpringBootApplication
//@ComponentScan("com")
public class DemoApplication {

	@RequestMapping("/")
	@ResponseBody
	String home() {
		return "Hello World";
	}

	@RequestMapping("/test")
	@ResponseBody
	String test() {
		return "test success!";
	}

	public static void main(String[] args) {
		Object[] objects = {DemoApplication.class, TestAction.class,
				UserAction.class, TemplateController.class, UserNGAction.class};
		SpringApplication.run(objects, args);
	}
}
