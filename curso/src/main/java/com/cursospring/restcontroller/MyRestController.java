package com.cursospring.restcontroller;


import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import com.cursospring.component.MyComponent;
import java.util.Map;
import java.util.HashMap;


//http://localhost:8091/restejemplo
@RestController
@RequestMapping("/restejemplo")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class MyRestController{

	//http://localhost:8091/restejemplo/saludo
	@GetMapping("/saludo")
    @ResponseBody
    public String saludo(){
       return new String("El servicio REST esta disponible");
    }

    //http://localhost:8091/restejemplo/datos
    @GetMapping("/datos")
    @ResponseBody
    public Map<String,String> getDatos(){
    	Map<String,String> mapa = new HashMap<String,String>();
    	mapa.put("1","Alef");
    	mapa.put("2","Bet");
    	mapa.put("3","Gimel");
    	return mapa;
    }

	//http://localhost:8091/restejemplo/sumar
	/*
	{
	  "x":23,
      "y":44
	}
	*/
    
    //@PostMapping("/sumar")
    //@RequestMapping(value = "/sumar", produces = "application/json", method = RequestMethod.POST)
    @RequestMapping(value="/sumar",method=RequestMethod.POST,produces={MediaType.APPLICATION_JSON_UTF8_VALUE},consumes={MediaType.APPLICATION_JSON_UTF8_VALUE})
    public int sumar(@RequestBody MyComponent comp){
       int x = comp.getX();
       int y = comp.getY();
       int suma = x + y;
       return suma;
    }

}