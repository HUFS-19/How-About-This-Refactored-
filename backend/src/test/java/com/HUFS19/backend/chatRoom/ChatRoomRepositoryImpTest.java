package com.HUFS19.backend.chatRoom;

import com.HUFS19.backend.category.CategoryRepository;
import com.HUFS19.backend.category.CategoryRepositoryImp;
import com.HUFS19.backend.product.ProductRepository;
import com.HUFS19.backend.product.ProductRepositoryImp;
import com.HUFS19.backend.productImg.ProductImgRepositoryImp;
import com.HUFS19.backend.user.UserRepository;
import com.HUFS19.backend.user.UserRepositoryImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@Import({ChatRoomRepositoryImp.class, UserRepositoryImp.class, CategoryRepositoryImp.class, ProductRepositoryImp.class})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class ChatRoomRepositoryImpTest {
    @Autowired
    TestEntityManager testEM;
    @Autowired
    ChatRoomRepository chatRoomRepository;
    @Autowired
    UserRepository userRepository;
    @Autowired
    CategoryRepository categoryRepository;
    @Autowired
    ProductRepository productRepository;


    @Test
    public void 저장_조회(){
        ChatRoom chatRoom = new ChatRoom();
        chatRoom.setCategory(categoryRepository.findById(1).get());
        chatRoom.setUser(userRepository.findById("testID").get());
        chatRoom.setInquirer(userRepository.findById("niceto").get());
        chatRoom.setProduct(productRepository.findById(1).get());

        int id = chatRoomRepository.save(chatRoom);
        ChatRoom saved = chatRoomRepository.findById(id).get();

        assertEquals(chatRoom, saved);
    }

}