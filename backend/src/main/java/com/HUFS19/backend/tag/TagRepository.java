package com.HUFS19.backend.tag;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TagRepository {
    int save(Tag tag);

    Optional<Tag> findById(int id);
}
