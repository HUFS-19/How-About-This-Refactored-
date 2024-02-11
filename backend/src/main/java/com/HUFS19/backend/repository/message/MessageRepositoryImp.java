package com.HUFS19.backend.repository.message;

import jakarta.persistence.EntityManager;

import java.util.Optional;

public class MessageRepositoryImp implements MessageRepository{
    private EntityManager em;

    public MessageRepositoryImp(EntityManager em){
        this.em=em;
    }

    @Override
    public int save(Message message) {
        em.persist(message);
        return message.getId();
    }

    @Override
    public Optional<Message> findById(int id) {
        return Optional.ofNullable(em.find(Message.class, id));
    }
}
