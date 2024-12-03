package com.example.api.response;

import org.springframework.http.HttpStatus;

public interface ErrorCodeInterface {
    Integer getCode();
    HttpStatus getHttpStatus();
    String getMessage();
}
