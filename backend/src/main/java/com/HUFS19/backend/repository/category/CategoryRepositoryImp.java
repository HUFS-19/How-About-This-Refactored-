package com.HUFS19.backend.repository.category;

import jakarta.persistence.EntityManager;

import java.util.List;
import java.util.Optional;

public class CategoryRepositoryImp implements CategoryRepository {
    private EntityManager em;

    public CategoryRepositoryImp(EntityManager em){
        this.em=em;
    }

    @Override
    public int save(Category category) {
        em.persist(category);
        return category.getCategoryId();
    }

    @Override
    public Optional<Category> findById(int categoryId) {
//        List<Category> result = em.createQuery("select p from Product p where p.id = :categoryId", Category.class)
//                .setParameter("categoryId", categoryId)
//                .getResultList();
//        return result.stream().findAny();
        return Optional.ofNullable(em.find(Category.class, categoryId));
    }

    @Override
    public Optional<Category> findByName(String categoryName) {
        List<Category> result = em.createQuery("select c from Category c where c.categoryName = :categoryName", Category.class)
                .setParameter("categoryName", categoryName)
                .getResultList();

        return result.stream().findAny();

    }

//    public BooleanExpression eqCategory(int categoryId){
//        if (findById(categoryId).isEmpty()){
//            return null;
//        }
//        return Category.
//    }
}
