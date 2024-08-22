package com.kafka.consumer.listener;

import com.kaffka.consumer.mode.request.RequestObject;
import com.kafka.consumer.kafka.message.KafkaMessage;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class WebListener {

	@KafkaListener(topics = "kafka-topic-demo", groupId = "p1")
	public void listen(ConsumerRecord<String, Object> record, Acknowledgment ack) {
		
		log.info("received message from broker!");
		KafkaMessage message = (KafkaMessage) record.value();
		RequestObject value = message.getPayload(RequestObject.class);
		log.info("orderedID: {}", value.getOrderedID());
		log.info("name: {}", value.getName());
		log.info("address: {}",value.getAddress());
		log.info("contactNumber: {}", value.getContactNumber());
		log.info("totalAmount: {}", value.getTotalAmount());
		
		ack.acknowledge();
	}
}
