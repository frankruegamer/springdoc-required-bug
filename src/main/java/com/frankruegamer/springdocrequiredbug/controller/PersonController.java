package com.frankruegamer.springdocrequiredbug.controller;

import com.frankruegamer.springdocrequiredbug.domain.Person;
import com.frankruegamer.springdocrequiredbug.domain.Pet;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

	@GetMapping
	public Person getPerson() {
		return new Person("person", new Pet("dog"));
	}

}
