package com.cursospring.main;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
    public static final CharSequence MENSAJE = ",has entrado al curso de Spring Framework";

    private ISaludo saludo;
    
    public App(ISaludo saludo){
      this.saludo = saludo;
    }
    
    public void mensaje(){
      saludo.mensaje(MENSAJE);
    }

    public static void main( String[] args ){
        ISaludo saludoImpl = new SaludoImpl();
        new App(saludoImpl).mensaje();

        //Usando archivo de contexto XML
        contexto();
    }

    public static void contexto(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-context.xml");
        MiBean objBean = (MiBean) context.getBean("miBean");
        System.out.println(objBean.getValor());
    }
}
