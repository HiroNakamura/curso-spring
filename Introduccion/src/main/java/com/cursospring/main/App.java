package com.cursospring.main;


public class App {
    public static final String MENSAJE = "Bienvenido al mundo Spring !!";

    private ISaludo saludo;
    
    public App(ISaludo saludo){
      this.saludo = saludo;
    }
    
    public void mensaje(){
      
    }

    public static void main( String[] args ){
        System.out.println(MENSAJE);
    }
}
