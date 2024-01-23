package com.HUFS19.backend.product;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class ProductServiceTest {
    @Autowired
    ProductService productService;
    @Autowired
    ProductRepository jpaProductRepository;

    @Test
    void 상품_추가(){
        Product product = new Product();
        product.setCategory(1);
        product.setDetail("상품설명");
        product.setLink("www");
        product.setMainImg("/main");
        //참조키가 있는 테이블 데이터는 참조하는 테이블 객체까지 넣어야 한다??
//        product.setUser("testID");
    }

    @Test
    void 상품아이디로_상품_찾기(){
        productService.findOne(1);

    }


}