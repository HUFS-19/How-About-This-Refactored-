package com.HUFS19.backend.controller;

import com.HUFS19.backend.common.dto.ApiResponseDto;
import com.HUFS19.backend.common.dto.ErrorResponse;
import com.HUFS19.backend.common.dto.SuccessResponse;
import com.HUFS19.backend.common.util.ResponseUtils;
import com.HUFS19.backend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/userAPI")
public class UserController {
    private UserService userService;

    @Autowired
    public UserController(UserService userService){
        this.userService=userService;
    }
    @GetMapping("/idCheck/{id}")
    @ResponseBody
    ApiResponseDto checkIdDuplication(@PathVariable("id") String id){
        boolean isDuplicated = userService.checkIdDuplication(id);
        if(isDuplicated){
            return ResponseUtils.error(new ErrorResponse("이미 존재하는 아이디입니다."));
        }
        return ResponseUtils.ok(new SuccessResponse("사용가능한 아이디입니다."));
    }
}
