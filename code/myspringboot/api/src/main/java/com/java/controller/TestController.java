package com.java.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @RequestMapping("/test")
    public String hello() {
        return "<a href='goto_auth_url'>go</a>";
    }

}

