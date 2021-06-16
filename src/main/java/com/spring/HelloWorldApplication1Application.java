package com.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class HelloWorldApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(HelloWorldApplication1Application.class, args);
		System.out.println("Hello from bridgelabz");
	}
	@Controller
	public class HelloWebController {
		@GetMapping("/HelloWorldApplication-1/src/main/resources/webapp/hello")
		public String hello() {
			return "hello";
		}
		
		@GetMapping("/HelloWorldApplication-1/src/main/resources/webapp/message")
		public String message (Model model) {
			model.addAttribute("message", "This is a custom message");
			return "message";
		}
	}

}
