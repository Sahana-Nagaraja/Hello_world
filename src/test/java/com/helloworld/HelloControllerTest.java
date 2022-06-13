package com.helloworld;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@WebMvcTest(HelloController.class)
class HelloControllerTest {

    @Autowired
    MockMvc mockMvc;
    @MockBean
    HelloService helloService;
    @InjectMocks
    HelloController helloController;

    @Test
    void testHelloWorld() throws Exception {
        Mockito.when(helloService.sayHello()).thenReturn("Hello World");
        mockMvc.perform(get("/hello"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(content().string("Hello World"));
    }
}