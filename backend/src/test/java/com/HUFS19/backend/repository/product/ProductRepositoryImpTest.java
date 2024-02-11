package com.HUFS19.backend.repository.product;

import com.HUFS19.backend.repository.category.CategoryRepository;
import com.HUFS19.backend.repository.category.CategoryRepositoryImp;
import com.HUFS19.backend.repository.product.Product;
import com.HUFS19.backend.repository.product.ProductRepository;
import com.HUFS19.backend.repository.product.ProductRepositoryImp;
import com.HUFS19.backend.repository.user.UserRepository;
import com.HUFS19.backend.repository.user.UserRepositoryImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Import({ProductRepositoryImp.class, UserRepositoryImp.class, CategoryRepositoryImp.class})
//@Import(UserRepositoryImp.class)
//@Transactional
//@Commit
class ProductRepositoryImpTest {
    @Autowired
    TestEntityManager testEM;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    UserRepository userRepository;

    //id, date 확인 필요
    @Test
    public void 상품_저장_확인(){
        Product product = new Product();

        product.setUser(userRepository.findById("testID").get());
        product.setLink("http://www.com");
        product.setDetail("상품 상세설명");
        product.setName("상품 이름");
        product.setCategory(categoryRepository.findById(1).get());
        product.setMainImg("/img/001.jpg");

        int productId = productRepository.save(product);
        Product foundProduct = productRepository.findById(productId).get();

        assertEquals(product.getName(), foundProduct.getName());
        assertEquals(product.getLink(), foundProduct.getLink());
        assertEquals(product.getDetail(), foundProduct.getDetail());
        assertEquals(product.getCategory(), foundProduct.getCategory());
        assertEquals(product.getMainImg(), foundProduct.getMainImg());
        assertEquals(product.getName(), foundProduct.getName());
    }

}