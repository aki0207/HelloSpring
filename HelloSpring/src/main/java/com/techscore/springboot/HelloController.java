package com.techscore.springboot;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloController {

	
	@RequestMapping("/")
    String hello() {
        return "Hello Spring Boot!";
    }
	
}
