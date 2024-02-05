package com.HUFS19.backend.snsType;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface SnsTypeRepository {
    int save(SnsType snsType);

    Optional<SnsType> findByID(int id);

}
