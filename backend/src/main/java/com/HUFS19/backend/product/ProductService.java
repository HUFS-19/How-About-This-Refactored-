package com.HUFS19.backend.product;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@org.springframework.stereotype.Service
@Transactional
public class ProductService {
    private final ProductRepository productRepository;
    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public int addProduct(Product product) {
        productRepository.save(product);
        return product.getProductId();

    }

    public Optional<Product> findOne(int productId){
        return productRepository.findById(productId);
    }



}
