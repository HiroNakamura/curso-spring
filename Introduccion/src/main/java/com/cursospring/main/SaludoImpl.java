package com.cursospring.main;

public class SaludoImpl implements ISaludo{
   @Override
   public void mensaje(CharSequence cadena){
      System.out.println("Hola "+cadena);
   }

}
