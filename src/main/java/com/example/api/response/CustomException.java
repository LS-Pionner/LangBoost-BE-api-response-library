package com.example.api.response;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public class CustomException extends RuntimeException{
    private final ErrorCodeInterface errorCode;

    @Override
    public String getMessage() {
        return errorCode.getMessage();
    }
}
