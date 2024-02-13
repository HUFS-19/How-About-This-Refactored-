package com.HUFS19.backend.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorResponse {
//    private int status;
    private String message;

    public ErrorResponse(String message){
        this.message=message;
    }
}
