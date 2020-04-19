package com.cursospring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cursospring")
public class AppController {

    //http://localhost:8091/cursospring/index
    @GetMapping("/index")
    public String index(){
        return "index";
    }
}