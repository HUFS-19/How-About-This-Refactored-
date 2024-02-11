package com.HUFS19.backend.service;

import com.HUFS19.backend.dto.product.ProductSummary;
import com.HUFS19.backend.repository.product.Product;
import com.HUFS19.backend.repository.product.ProductRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
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
        return product.getId();

    }

    public Optional<Product> findOne(int productId){
        return productRepository.findById(productId);
    }

    public List<Product> findAll(){
        return productRepository.findAll(1);
    }

//    public List<ProductSummary> getCategoryProducts(int category, String sort){
//        if(category==1){
//            category=null;
//        }
//    }



}
