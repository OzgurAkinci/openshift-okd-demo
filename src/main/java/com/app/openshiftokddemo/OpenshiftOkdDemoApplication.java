package com.app.openshiftokddemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class OpenshiftOkdDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenshiftOkdDemoApplication.class, args);
	}

	@GetMapping(value = "/api")
	public ResponseEntity<String> getApi() {
		return ResponseEntity.ok("Hi Everybody!");
	}
}
