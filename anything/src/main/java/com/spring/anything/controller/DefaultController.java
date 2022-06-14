package com.spring.anything.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("hello")
@RestController
public class DefaultController {

    @GetMapping
//    @ResponseBody
    public String hello() {
        return "Hello! There is Anything of Spring ";
    }

    @PostMapping
    public String register(String str) {
        return str;
    }

    @PutMapping
    public String update(String str) {
        return str;
    }

    @DeleteMapping
    public String delete(String str) {
        return str;
    }

}
