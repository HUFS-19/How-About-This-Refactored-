package com.HUFS19.backend.repository.comment;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CommentRepository {
    int save(Comment comment);
    Optional<Comment> findByID(int id);
}
