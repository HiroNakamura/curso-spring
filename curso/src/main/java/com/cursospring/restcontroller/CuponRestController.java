package com.cursospring.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import com.cursospring.repository.CuponRepository;
import com.cursospring.model.Cupon;

//http://localhost:8091/cuponapi
@RestController
@RequestMapping("/cuponapi")
public class CuponRestController{

    private static final Logger LOGGER = LoggerFactory.getLogger(CuponRestController.class);

    @Autowired
    private CuponRepository cuponRepository;
    
    //http://localhost:8091/cuponapi/cupones
    @RequestMapping(value="/cupones", method = RequestMethod.POST)
    public Cupon crear(@RequestBody Cupon cupon){
        LOGGER.info("Se creo el cupon: {}",cupon);
        return this.cuponRepository.save(cupon);
    }

    //http://localhost:8091/cuponapi/cupones/codigoBuscar
    @RequestMapping(value="/cupones/{codigo}", method=RequestMethod.GET)
    public Cupon obtenerCupon(@PathVariable("codigo") String codigo){
        LOGGER.info("Se obtiene el cupon con codigo: {}",codigo);
        return this.cuponRepository.findByCodigo(codigo);
    }

    //http://localhost:8091/cuponapi/cupones
    @RequestMapping(value="/cupones", method=RequestMethod.GET)
    public List<Cupon> getAllCupones(){
        LOGGER.info("Obtenemos todos los cupones");
        return this.cuponRepository.findAll();
    }

}