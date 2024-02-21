package com.HUFS19.backend.service;

import com.HUFS19.backend.dto.chatRoom.ChatRoomDetail;
import com.HUFS19.backend.repository.chatRoom.ChatRoom;
import com.HUFS19.backend.repository.chatRoom.ChatRoomRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ChatRoomService {
    ChatRoomRepository chatRoomRepository;
    @Autowired
    public ChatRoomService(ChatRoomRepository chatRoomRepository){
        this.chatRoomRepository=chatRoomRepository;
    }

    public List<ChatRoom> getChatRoomList(String userId){
        return chatRoomRepository.findChatRoomByUserId(userId);
    }
}
