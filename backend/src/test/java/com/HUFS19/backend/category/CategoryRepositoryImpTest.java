package com.HUFS19.backend.category;

import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Import(CategoryRepositoryImp.class)
//@AutoConfigureTestDatabase
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

class CategoryRepositoryImpTest {
    @Autowired
    TestEntityManager testEM;

    @Autowired
    private CategoryRepository categoryRepository;

    @Test
    void save_findById_test() {
        Category category = new Category("캠핑");

        int categoryId = categoryRepository.save(category);
        Category foundCategory = categoryRepository.findById(categoryId).get();

        assertEquals(foundCategory.getCategoryName(), category.getCategoryName());
    }

}