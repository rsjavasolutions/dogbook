package com.rsjava.doogbook.exception;

public class InvalidUsernameFormatException extends RuntimeException {
    public InvalidUsernameFormatException(String message) {
        super("Invalid Username format " + message);
    }
}
