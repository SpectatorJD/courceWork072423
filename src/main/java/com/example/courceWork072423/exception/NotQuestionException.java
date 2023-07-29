package com.example.courceWork072423.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class NotQuestionException extends RuntimeException{
    public NotQuestionException() {
    }

    public NotQuestionException(String message) {
        super(message);
    }

    public NotQuestionException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotQuestionException(Throwable cause) {
        super(cause);
    }

    public NotQuestionException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
