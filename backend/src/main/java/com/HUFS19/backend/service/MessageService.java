package com.HUFS19.backend.service;

import com.HUFS19.backend.dto.message.LastMessageDto;
import com.HUFS19.backend.repository.message.Message;
import com.HUFS19.backend.repository.message.MessageRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

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

    public LastMessageDto getLastMessage(int ChatRoomId) {
         Optional<Message> lastMessage = messageRepository.findLastByChatRoom(ChatRoomId);

        return lastMessage.map(message -> new LastMessageDto(timeStampToString(message.getTime()), message.getContent()))
                .orElseGet(() -> new LastMessageDto("", "최근 메세지를 확인할 수 없습니다."));

//        if (lastMessage.isPresent()){
//            return new LastMessageDto(timeStampToString(lastMessage.get().getTime()), lastMessage.get().getContent());
//        }
//        else{
//            return new LastMessageDto("", "최근 메세지를 확인할 수 없습니다.");
//        }
    }

    public String timeStampToString(Timestamp timestamp){
        String timeString = new SimpleDateFormat("yyyy/MM/dd").format(timestamp);

        String[] timeArray = timeString.split("/");
        List<String> timeList= new ArrayList<>(Arrays.asList(timeArray));

        timeList.replaceAll(s->Integer.toString(Integer.parseInt(s)));
        timeList.add(1, "년 ");
        timeList.add(3, "월 ");
        timeList.add( "일");

        String resultString = String.join("", timeList);

        return resultString;
    }
}
