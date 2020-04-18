package com.cursospring.main;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.cursospring.main.servicio.Servicio;

@Configuration
@ComponentScan("com.cursospring.main.servicio")
public class AppConfig {

    @Bean(name="helloBean")
    public HelloWorld helloWorld() {
        return new HelloWorldImpl();
    }

    @Bean(name="servicioBean")
    public Servicio miServicio() {
        return new Servicio();
    }


}