package com.producto.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("producto")
public class ProductoController {

    //http://localhost:9090/producto/index
    @GetMapping("index")
    public String index(){
        return "index";
    }
}