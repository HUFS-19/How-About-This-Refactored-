package com.HUFS19.backend.message;

import jakarta.persistence.EntityManager;

public class MessageRepositoryImp implements MessageRepository{
    private EntityManager em;

    public MessageRepositoryImp(EntityManager em){
        this.em=em;
    }
}
