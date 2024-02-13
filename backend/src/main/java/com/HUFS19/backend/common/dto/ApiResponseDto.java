package com.HUFS19.backend.common.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApiResponseDto<T> {
    private boolean success;
    private T data;
    private ErrorResponse error;



}
