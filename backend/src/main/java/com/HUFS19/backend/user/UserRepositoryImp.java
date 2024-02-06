package com.HUFS19.backend.user;

import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class UserRepositoryImp implements UserRepository{
    private EntityManager em;

    public UserRepositoryImp(EntityManager em){
        this.em=em;
    }

    @Override
    public String save(User user) {
        em.persist(user);
        return user.getUserId();
    }

    @Override
    public Optional<User> findById(String userId) {

        return Optional.ofNullable(em.find(User.class, userId));
    }

    @Override
    public Optional<User> findByName(String userName) {
        return Optional.empty();
    }
}
