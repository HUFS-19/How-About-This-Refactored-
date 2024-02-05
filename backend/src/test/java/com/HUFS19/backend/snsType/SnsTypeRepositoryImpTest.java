package com.HUFS19.backend.snsType;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.context.annotation.Import;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@Import(SnsTypeRepositoryImp.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)

class SnsTypeRepositoryImpTest {
    @Autowired
    TestEntityManager testID;
    @Autowired
    SnsTypeRepository snsTypeRepository;

    @Test
    void save() {
        SnsType snsType = new SnsType();
        snsType.setName("sns");

        int id = snsTypeRepository.save(snsType);
        SnsType saved = snsTypeRepository.findByID(id).get();

        assertEquals(snsType, saved);
    }
}