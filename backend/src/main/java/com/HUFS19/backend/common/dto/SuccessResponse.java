package com.HUFS19.backend.common.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SuccessResponse {
    private String message;

    public SuccessResponse(String message){
        this.message=message;
    }
}
