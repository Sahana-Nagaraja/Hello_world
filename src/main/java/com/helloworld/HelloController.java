package com.helloworld;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class HelloController {

    HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public ResponseEntity<String> sayHello() {
        String helloResponse = helloService.sayHello();
        return ResponseEntity.ok(helloResponse);
    }
}
