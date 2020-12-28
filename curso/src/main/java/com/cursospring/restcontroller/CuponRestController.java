package com.cursospring.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cursospring.model.Cupon;

@RestController
@RequestMapping("/cuponapi")
public class CuponRestController{

    @Autowired
    private CuponRepository cuponRepository;
    
    public Cupon crear(Cupon cupon){
        return this.cuponRepository.save(cupon);
    }

}