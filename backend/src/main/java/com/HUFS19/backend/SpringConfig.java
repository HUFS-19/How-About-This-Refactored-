package com.HUFS19.backend;

import com.HUFS19.backend.product.ProductRepositoryImp;
import com.HUFS19.backend.product.ProductRepository;
import com.HUFS19.backend.product.ProductService;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    private EntityManager em;

    @Autowired
    public SpringConfig(EntityManager em){
        this.em=em;
    }

    @Bean
    public ProductService service(){
        return new ProductService(productRepository());
    }
    @Bean
    public ProductRepository productRepository(){return  new ProductRepositoryImp(em);
    }
}
