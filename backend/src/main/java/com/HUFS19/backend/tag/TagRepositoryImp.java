package com.HUFS19.backend.tag;

import jakarta.persistence.EntityManager;

import java.util.Optional;

public class TagRepositoryImp implements TagRepository{
    private EntityManager em;

    public TagRepositoryImp(EntityManager em){
        this.em=em;
    }

    @Override
    public int save(Tag tag) {
        em.persist(tag);
        return tag.getId();
    }

    @Override
    public Optional<Tag> findById(int id) {
        return Optional.ofNullable(em.find(Tag.class, id));
    }
}
