package com.HUFS19.backend.userInfo;

import jakarta.persistence.EntityManager;

public class UserInfoRepositoryImp implements UserInfoRepository{
    private EntityManager em;

    public UserInfoRepositoryImp(EntityManager em){
        this.em=em;
    }
}
