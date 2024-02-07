package com.HUFS19.backend.productImg;

import com.HUFS19.backend.product.ProductRepository;
import com.HUFS19.backend.product.ProductRepositoryImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import({ProductImgRepositoryImp.class, ProductRepositoryImp.class})
class ProductImgRepositoryImpTest {
    @Autowired
    TestEntityManager testEM;
    @Autowired
    ProductImgRepository productImgRepository;
    @Autowired
    ProductRepository productRepository;
    @Test
    void save() {
        ProductImg productImg = new ProductImg();

        productImg.setProduct(productRepository.findById(1).get());
        productImg.setImgOrder(5);
        productImg.setImg("/img/001.jpg");

        int productImgId = productImgRepository.save(productImg);
        ProductImg foundProductImg = productImgRepository.findById(productImgId).get();

        assertEquals(productImg.getImgOrder(), foundProductImg.getImgOrder());
        assertEquals(productImg.getImg(), foundProductImg.getImg());
    }

    @Test
    void findByProductId() {
    }
}