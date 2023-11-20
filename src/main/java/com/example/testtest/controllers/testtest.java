package com.example.testtest.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class testtest {
    @RequestMapping("/hello")
    public String hello() {
        return "revised_motorcycle_table";
    }
}
