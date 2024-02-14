package com.HUFS19.backend.repository.tag;

import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class TagRepositoryImp implements TagRepository{
    private EntityManager em;
    private JPAQueryFactory query;
    public TagRepositoryImp(EntityManager em){
        this.em=em;
        this.query = new JPAQueryFactory(em);
    }

    @Override
    public int save(Tag tag) {
        em.persist(tag);
        return tag.getId();
    }

    @Override
    public Optional<Tag> findById(int id) {
        return Optional.ofNullable(em.find(Tag.class, id));
    }

    @Override
    public List<String> findByProductId(int productId) {
        QTag tag = QTag.tag;
        return query.select(tag.name).from(tag).where(tag.product.id.eq(productId)).fetch();
    }
}
