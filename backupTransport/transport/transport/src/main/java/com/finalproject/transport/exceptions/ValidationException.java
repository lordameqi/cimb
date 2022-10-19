/*
 * Copyright (c) 2022. Made by Rachmad Fadillah
 */

package com.finalproject.transport.exceptions;

public class ValidationException extends RuntimeException {
	private static final long serialVersionUID = 1L;
	private String msg;

	public ValidationException(String msg) {
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}
}
