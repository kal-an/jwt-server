package com.organization.jwtserver.exception;

public class AuthException extends RuntimeException{
    public AuthException(String message) {
        super(message);
    }
}
