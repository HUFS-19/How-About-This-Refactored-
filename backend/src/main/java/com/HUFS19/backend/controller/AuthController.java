package com.HUFS19.backend.controller;

import com.HUFS19.backend.common.dto.ApiResponseDto;
import com.HUFS19.backend.common.util.ResponseUtils;
import com.HUFS19.backend.dto.user.JoinDto;
import com.HUFS19.backend.repository.user.User;
import com.HUFS19.backend.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.AbstractUrlBasedView;

@Controller
//@RequestMapping("/authAPI")
@RequestMapping("/userAPI")
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @ResponseBody
    @PostMapping("/join")
    public ApiResponseDto join(JoinDto joinDto){
        userService.joinProcess(joinDto);
        return ResponseUtils.ok("join success");
    }

    @ResponseBody
    @PostMapping("/login")
    public ApiResponseDto login(JoinDto joinDto){
//        System.out.println("!!!!!!!!!!!!!!!!!!");

        return ResponseUtils.ok("Developing");
    }
}

