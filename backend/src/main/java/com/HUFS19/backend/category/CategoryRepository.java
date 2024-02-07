package com.HUFS19.backend.category;

import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CategoryRepository {
    int save(Category category);

    Optional<Category> findById(int categoryId);

    Optional<Category> findByName(String categoryName);

}
