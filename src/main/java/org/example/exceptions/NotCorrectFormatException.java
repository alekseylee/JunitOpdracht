package org.example.exceptions;

public class NotCorrectFormatException extends RuntimeException {
    public NotCorrectFormatException(String string) {
        super(string);
    }
}
