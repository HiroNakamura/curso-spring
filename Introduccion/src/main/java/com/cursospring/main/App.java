package com.cursospring.main;


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
    }
}
