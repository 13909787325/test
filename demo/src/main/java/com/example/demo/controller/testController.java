package com.example.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/hello")
public class testController {
    @RequestMapping(value = "/test")
    public String test(){
        return "index";
    }
}
