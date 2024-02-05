package com.HUFS19.backend.userInfo;

import com.HUFS19.backend.user.User;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class UserInfoRepositoryImp implements UserInfoRepository{
    private EntityManager em;

    public UserInfoRepositoryImp(EntityManager em){
        this.em=em;
    }

    @Override
    public String save(UserInfo userInfo) {
        em.persist(userInfo);
        return userInfo.getUser().getId();
    }

    @Override
    public Optional<UserInfo> findByUserId(String userId) {
        List<UserInfo> result = em.createQuery("select u from UserInfo u where u.user.id = :userId", UserInfo.class)
                .setParameter("userId", userId)
                .getResultList();

        return result.stream().findAny();
    }
}
