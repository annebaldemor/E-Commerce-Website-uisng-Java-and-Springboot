package com.kafka.producer.controller;

import com.kaffka.producer.mode.request.RequestObject;
import com.kafka.producer.service.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {
	
	@Autowired
	private WebService service;
	
	@PostMapping(value = "/post/message", consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Object> sendToKafka(@RequestBody RequestObject request){
		return service.sendToKafkaService(request);
	}

}
