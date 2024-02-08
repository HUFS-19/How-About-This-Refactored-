package com.HUFS19.backend.userLike;

import jakarta.persistence.EntityManager;

public class UserLikeRepositoryImp implements UserLikeRepository{
    private EntityManager em;

    public UserLikeRepositoryImp(EntityManager em){
        this.em=em;
    }
}
