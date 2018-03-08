package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    private Book book;

    @RequestMapping("/hello")
    public String index() {
        System.out.println(book.toString());
        return "Hello ,spring boot!";
    }
}
