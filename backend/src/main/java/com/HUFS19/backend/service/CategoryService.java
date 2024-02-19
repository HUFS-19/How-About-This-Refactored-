package com.HUFS19.backend.service;

import com.HUFS19.backend.repository.category.Category;
import com.HUFS19.backend.repository.category.CategoryRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    public String getName(int id){
        Category category = categoryRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("값이 없습니다."));
        return category.getCategoryName();
    }

    public List<Category> getAll(){
        return categoryRepository.getAll();
    }
}
