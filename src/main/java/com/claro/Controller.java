package com.claro;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	
	@GetMapping(value = "/hello/{name}", produces = { "application/json" })
	public String hello(@PathVariable String name) {

		return "Instance Group Successfully Deploy, thanks to " + name;

	}

}
