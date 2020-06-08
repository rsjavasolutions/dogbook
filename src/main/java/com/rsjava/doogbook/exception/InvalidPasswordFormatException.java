package com.rsjava.doogbook.exception;

import lombok.NonNull;

public class InvalidPasswordFormatException extends RuntimeException {
    public InvalidPasswordFormatException(String password) {
        super("Invalid password format " + password);
    }
}
