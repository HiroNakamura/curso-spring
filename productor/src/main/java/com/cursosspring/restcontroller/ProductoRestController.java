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
import com.cursospring.repository.ProductoRepository;
import com.cursospring.model.Producto;

http://localhost:8092/productoapi
@RestController
@RequestMapping("/productoapi")
public class ProductoRestController{

    private static final Logger LOGGER = LoggerFactory.getLogger(ProductoRestController.class);

    @Autowired
    private ProductoRepository productoRepository;
    
    //http://localhost:8092/productoapi/productos
    @RequestMapping(value="/productos", method = RequestMethod.POST)
    public Producto crear(@RequestBody Producto producto){
        LOGGER.info("Se creo el producto: {}",producto);
        return this.productoRepository.save(producto);
    }

    //http://localhost:8092/productoapi/productos/codigoBuscar
    @RequestMapping(value="/productos/{codigo}", method=RequestMethod.GET)
    public Producto obtenerCupon(@PathVariable("codigo") String codigo){
        LOGGER.info("Se obtiene el producto con codigo: {}",codigo);
        return this.productoRepository.findByCodigo(codigo);
    }

    //http://localhost:8092/productoapi/productos
    @RequestMapping(value="/cupones")
    public List<Producto> getAllProductos(){
        LOGGER.info("Obtenemos todos los productos");
        return this.productoRepository.findAll();
    }


}