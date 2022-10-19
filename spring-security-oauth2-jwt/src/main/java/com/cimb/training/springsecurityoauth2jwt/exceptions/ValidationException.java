package com.cimb.training.springsecurityoauth2jwt.exceptions;

import lombok.Data;
import lombok.Getter;

@Data
public class ValidationException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    @Getter
    private String msg;

    public ValidationException(String msg) {

        this.msg = msg;
    }
}
