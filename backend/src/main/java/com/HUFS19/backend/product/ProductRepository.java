package com.HUFS19.backend.product;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository {
    Product save(Product product);
//    List<Product> findByCategory(int categoryId);
    List<Product> findAll(int categoryId);

    Optional<Product> findById(int ProductId);


}
