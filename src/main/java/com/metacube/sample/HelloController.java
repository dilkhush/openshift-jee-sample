package com.metacube.sample;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {

    @RequestMapping("/sayhello")
    public String index() {
        return "Hello World!";
    }

}