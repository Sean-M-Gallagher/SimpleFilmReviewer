package com.sean.controller;

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class helloController{

    @GetMapping("/")
    public String helloworld(){
        return "Hello World";
    }

}