package com.HUFS19.backend.repository.user;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository {
    public String save(User user);
    public Optional<User> findById(String userId);
}
