package com.HUFS19.backend.repository.userInfo;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserInfoRepository {
    String save(UserInfo userInfo);
    Optional<UserInfo> findByUserId(String userId);
}
