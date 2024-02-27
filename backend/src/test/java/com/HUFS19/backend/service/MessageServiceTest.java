package com.HUFS19.backend.service;

import jakarta.transaction.Transactional;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@Transactional
class MessageServiceTest {
    @Autowired
    MessageService messageService;

    @Test
    void timeStampToString() {
        String sampleDateString = "2024/2/23 13:01:54";
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        try {
            Date stringToDate = dateFormat.parse("2024/2/23 13:01:54");
            Timestamp sampleTimestamp = new Timestamp(stringToDate.getTime());
            System.out.println(sampleTimestamp);

            assertEquals(sampleTimestamp instanceof Timestamp, true);

            String resultString = messageService.timeStampToString(sampleTimestamp);

            System.out.println(resultString);
            assertEquals(resultString, "2024년 2월 23일");

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}