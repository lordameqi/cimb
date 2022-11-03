/*
 * Copyright (c) 2022. Made by Rachmad Fadillah
 */

package com.finalproject.transport.entity.security;

import java.io.Serializable;

public class JwtResponse implements Serializable {
	private static final long serialVersionUID = -8091879091924046844L;
	
	private final String jwttoken;
	
	public JwtResponse(String jwttoken) {
		this.jwttoken = jwttoken;
	}
	
	public String getToken() {
		return this.jwttoken;
	}
}
