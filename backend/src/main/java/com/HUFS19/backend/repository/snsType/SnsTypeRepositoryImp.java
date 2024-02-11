package com.HUFS19.backend.repository.snsType;

import jakarta.persistence.EntityManager;

import java.util.Optional;

public class SnsTypeRepositoryImp implements SnsTypeRepository{
    private EntityManager em;

    public SnsTypeRepositoryImp(EntityManager em){
        this.em=em;
    }

    @Override
    public int save(SnsType snsType) {
        em.persist(snsType);
        return snsType.getId();
    }

    @Override
    public Optional<SnsType> findByID(int id) {
        return Optional.ofNullable(em.find(SnsType.class, id));
    }
}
