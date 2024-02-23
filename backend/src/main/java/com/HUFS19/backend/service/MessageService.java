package com.HUFS19.backend.service;

import com.HUFS19.backend.repository.message.Message;
import com.HUFS19.backend.repository.message.MessageRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class MessageService {
    MessageRepository messageRepository;

    public MessageService(MessageRepository messageRepository){
        this.messageRepository = messageRepository;
    }

    public List<Message> getAllMessage(int ChatRoomId){
        return messageRepository.findAllByChatRoom(ChatRoomId);
    };

    public Message getLastMessage(int ChatRoomId) {
        return messageRepository.findLastByChatRoom(ChatRoomId).get();
    }
}
