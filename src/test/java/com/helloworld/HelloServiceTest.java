package com.helloworld;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloServiceTest {
    HelloService helloService = new HelloService();

    @Test
    void testSayHello() {
        String helloResponse = helloService.sayHello();
        assertEquals("Hello World", helloResponse);
    }
}
