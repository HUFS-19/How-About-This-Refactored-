package com.HUFS19.backend.product;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository {
    int save(Product product);
    //구현 필요
//    List<Product> findByCategory(int categoryId);
    List<Product> findAll(int categoryId);

    Optional<Product> findById(int productId);

    Optional<Product> findByName(String productName);
}
