package com.HUFS19.backend.user;

import com.HUFS19.backend.userInfo.UserInfo;
import com.HUFS19.backend.userInfo.UserInfoRepository;
import com.HUFS19.backend.userInfo.UserInfoRepositoryImp;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Import({UserRepositoryImp.class})
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class UserRepositoryImpTest {

    @Autowired
    TestEntityManager testEM;
    @Autowired
    UserRepository userRepository;

    @Test
    void save() {
        //아이콘, 자기소개 set하지 않는 테스트 추가 필요함
        User user = new User();
        user.setId("testUser");
        user.setSalt("");
        user.setPassword("testPw");

        String id = userRepository.save(user);
        User saved = userRepository.findById(id).get();


        assertEquals(user, saved);
    }
}