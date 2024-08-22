package com.kafka.consumer.kafka.message;

import java.io.Serializable;
import java.util.UUID;

import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class KafkaMessage implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 6633511144530277960L;

	private UUID id;
	
	private Object payload;
	
	public<T> T getPayload(Class<T> clazz) {
		return new ObjectMapper().convertValue(this.payload, clazz);
	}
}
