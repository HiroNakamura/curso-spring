package com.cursospring.main;

public class SaludoImpl implements ISaludo{
   public void mensaje(CharSequence cadena){
      System.out.println("Mensaje: "+cadena);
   }

}
