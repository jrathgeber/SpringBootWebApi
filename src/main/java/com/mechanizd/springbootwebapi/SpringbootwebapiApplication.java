package com.mechanizd.springbootwebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootwebapiApplication {

	@GetMapping("/message")
	public String message() {

		return "Congrats !!! your app deployed successfully in Azure ! ";

	}


	@GetMapping("/secret")
	public String secret() {

		return "This is a secret message ";

	}



	@GetMapping("/update")
	public String update() {

		return "This API was updated today ";

	}


	public static void main(String[] args) {
		SpringApplication.run(SpringbootwebapiApplication.class, args);
	}

}
