package com.HUFS19.backend.controller;

import com.HUFS19.backend.common.dto.ApiResponseDto;
import com.HUFS19.backend.common.util.ResponseUtils;
import com.HUFS19.backend.dto.user.JoinDto;
import com.HUFS19.backend.repository.user.User;
import com.HUFS19.backend.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.AbstractUrlBasedView;

import java.security.Principal;
import java.util.Objects;

@RestController
//@RequestMapping("/authAPI")
@RequestMapping("/userAPI")
public class AuthController {
    private final UserService userService;

    public AuthController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/join")
    public ApiResponseDto join(JoinDto joinDto){
        userService.joinProcess(joinDto);
        return ResponseUtils.ok("join success");
    }

    @PostMapping("/login")
    public ApiResponseDto login(JoinDto joinDto){
        return ResponseUtils.ok("Developing");
    }

    @GetMapping("/checkLogin/{userId}")
    public ApiResponseDto checkLoginState(@PathVariable("userId") String userId, Principal principal){

        if (Objects.equals(principal.getName(), userId)){
            return ResponseUtils.ok(true);
        }
        return ResponseUtils.ok(false);
    }
}

