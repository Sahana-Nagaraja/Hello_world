package com.helloworld;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

@SpringBootTest
public class HelloIntegrationTest {

    @Autowired
    HelloController helloController;

    @Test
    void testSayHello() {
        ResponseEntity<String> helloResponse = helloController.sayHello();
        Assertions.assertEquals(ResponseEntity.ok("Hello World"), helloResponse);
    }
}
