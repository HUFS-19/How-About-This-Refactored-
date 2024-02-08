package com.HUFS19.backend.snsType;

import jakarta.persistence.EntityManager;

public class SnsTypeRepositoryImp implements SnsTypeRepository{
    private EntityManager em;

    public SnsTypeRepositoryImp(EntityManager em){
        this.em=em;
    }
}
