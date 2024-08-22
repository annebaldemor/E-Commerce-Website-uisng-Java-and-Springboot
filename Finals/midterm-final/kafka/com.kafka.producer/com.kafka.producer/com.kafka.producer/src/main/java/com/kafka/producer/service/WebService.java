package com.kafka.producer.service;

import java.util.UUID;

import com.kaffka.producer.mode.request.RequestObject;
import com.kafka.producer.kafka.message.KafkaMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class WebService {

	@Autowired
	private KafkaTemplate<String, Object> kafkaTemplate;
	
	public ResponseEntity<Object> sendToKafkaService(RequestObject request){
		
		log.info("sendToKafkaService method invoked()");
		
		KafkaMessage message = new KafkaMessage();
		message.setId(UUID.randomUUID());
		message.setPayload(request);
		
		kafkaTemplate.send("kafka-topic-demo", message);
		
		return ResponseEntity.ok().build();
	}
}
