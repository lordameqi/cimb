
package com.finalproject.transport.entity.security;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JwtRequest implements Serializable {
	private static final long serialVersionUID = 5926468583005150707L;
	private String email;
	private String password;

	public JwtRequest() {

	}

	public JwtRequest(String username, String password) {
		this.setEmail(email);
		this.setPassword(password);
	}

}
