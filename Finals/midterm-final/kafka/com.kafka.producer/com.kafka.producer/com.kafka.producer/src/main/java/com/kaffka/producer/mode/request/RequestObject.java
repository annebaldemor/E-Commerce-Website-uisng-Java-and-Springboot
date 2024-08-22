package com.kaffka.producer.mode.request;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RequestObject implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -3705139088300365712L;
	
	private String author;
	
	private String message;
}
