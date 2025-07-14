package com.hrsjp.ePrepSpring.helper;

public class MessageClass {
	
	private Long statusCode;
	private String message;
	
	public MessageClass() {}

	public MessageClass(Long statusCode, String message) {
		super();
		this.statusCode = statusCode;
		this.message = message;
	}

}
