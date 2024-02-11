package com.HUFS19.backend.common.util;

import com.HUFS19.backend.common.dto.ApiResponseDto;
import com.HUFS19.backend.common.dto.ErrorResponse;

public class ResponseUtils {
    public static <T> ApiResponseDto<T> ok(T response){
        ApiResponseDto apiResponseDto = new ApiResponseDto();
        apiResponseDto.setData(response);
        apiResponseDto.setSuccess(true);
        return apiResponseDto;
    }

    public static <T> ApiResponseDto<T> error(ErrorResponse response){
        ApiResponseDto apiResponseDto = new ApiResponseDto();
        apiResponseDto.setSuccess(false);
        apiResponseDto.setError(response);
        return apiResponseDto;
    }
}