package com.monitoring.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootPrometheusApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPrometheusApplication.class, args);
	}
	
	@GetMapping("/testapp")
	public String test() {
		return "Prometheus Test";
	}
	
	@GetMapping("v1/testapp")
	public String apptest() {
		return "Prometheus Test";
	}
	

}
