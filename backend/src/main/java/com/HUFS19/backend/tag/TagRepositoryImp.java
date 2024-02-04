package com.HUFS19.backend.tag;

import jakarta.persistence.EntityManager;

public class TagRepositoryImp implements TagRepository{
    private EntityManager em;

    public TagRepositoryImp(EntityManager em){
        this.em=em;
    }
}
