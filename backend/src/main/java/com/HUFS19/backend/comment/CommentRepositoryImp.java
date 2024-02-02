package com.HUFS19.backend.comment;

import jakarta.persistence.EntityManager;

public class CommentRepositoryImp implements CommentRepository{
    private EntityManager em;

    public CommentRepositoryImp(EntityManager em){
        this.em=em;
    }
}
