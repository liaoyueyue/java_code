package org.example.propertydemo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: liaoyueyue
 * Date: 2024-07-30
 * Time: 23:06
 */
@SpringBootTest
class TestPropertyTest {
    @Autowired
    TestProperty testProperty;

    @Test
    void getValue() {
        System.out.println("testProperty.getFile1() = " + testProperty.getFile1());
        System.out.println("testProperty.getFile1() = " + testProperty.getFile2());
    }

}