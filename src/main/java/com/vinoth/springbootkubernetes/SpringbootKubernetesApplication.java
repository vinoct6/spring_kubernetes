package com.vinoth.springbootkubernetes;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
public class SpringbootKubernetesApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootKubernetesApplication.class, args);
	}
}

@RestController
class GreetingsController {

	@Value("${first.name}")
	private String name;

	@GetMapping("/hello")
	public String greeting() {
		System.out.println("ENV Variable name = " + name);
		return "Hello " + name;
	}
}
