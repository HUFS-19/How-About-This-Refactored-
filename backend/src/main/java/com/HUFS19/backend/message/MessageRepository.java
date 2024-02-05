package com.HUFS19.backend.message;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository public interface MessageRepository {
    int save(Message message);
    Optional<Message> findById(int id);
}
