package com.HUFS19.backend.controller;

import com.HUFS19.backend.common.dto.ApiResponseDto;
import com.HUFS19.backend.common.util.ResponseUtils;
import com.HUFS19.backend.service.ChatRoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/chatRoomApi")
public class ChatRoomController {

    ChatRoomService chatRoomService;

    @Autowired
    public ChatRoomController(ChatRoomService chatRoomService){
        this.chatRoomService=chatRoomService;
    }

    @GetMapping("/{userId}/chatRoomLIst")
    @ResponseBody
    public ApiResponseDto getChatroomList(@PathVariable("userId") String userId){
       return ResponseUtils.ok(chatRoomService.getChatRoomList(userId));
    }

}
