package com.yebelo.rest.controllers;

import org.springframework.boot.jackson.JsonObjectSerializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllers {
	
	@GetMapping(path = "/FetchNextNumber")
	public ResponseEntity<?> fetchNextNumber(@RequestBody String CategoryCode) {
		return new ResponseEntity<>("sakdklalskdlk:asdkjaskdkl", HttpStatus.OK);
	}

}
