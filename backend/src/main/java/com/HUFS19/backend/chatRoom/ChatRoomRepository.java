package com.HUFS19.backend.chatRoom;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChatRoomRepository {
    int save(ChatRoom chatRoom);
    Optional<ChatRoom> findById(int id);
    Optional<ChatRoom> findByProductId(int productId);

}
