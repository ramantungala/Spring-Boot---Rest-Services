package com.test.rest.webservices.RestfulWebServices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping(path = "/hello-World")
	public String getHelloWorld() {
		return "Hello-World";
	}
	
	@GetMapping(path = "/hello-World-bean")
	public HelloWorldBean getHelloWorldBean() {
		return new HelloWorldBean("Hello-World");
	}
	//  /hello-World/path-variable/Raman -- If somebody typed Raman in URI to get mapped to {name}.
	@GetMapping(path = "/hello-World/path-variable/{name}")
	public HelloWorldBean getHelloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello-World, %s",name) );
	}
}
