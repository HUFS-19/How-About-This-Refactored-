package com.HUFS19.backend.comment;

import jakarta.persistence.EntityManager;

import java.util.Optional;

public class CommentRepositoryImp implements CommentRepository{
    private EntityManager em;

    public CommentRepositoryImp(EntityManager em){
        this.em=em;
    }

    @Override
    public int save(Comment comment) {
        em.persist(comment);
        return  comment.getId();
    }

    @Override
    public Optional<Comment> findByID(int id) {
        return Optional.ofNullable(em.find(Comment.class, id));
    }
}
