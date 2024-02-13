package com.HUFS19.backend.repository.userSns;

import jakarta.persistence.EntityManager;

public class UserSnsRepositoryImp implements UserSnsRepository{
    private EntityManager em;

    public UserSnsRepositoryImp(EntityManager em){
        this.em=em;
    }
}
