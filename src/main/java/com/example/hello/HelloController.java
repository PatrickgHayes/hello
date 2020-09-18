package com.example.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// here is to the pull requests
@RestController
public class HelloController {

    @RequestMapping("/")
    public String index() {
        return "Hello!";
    }

}
