package com.cursospring.main.servicio;

public class Celsius {
    private String valor;

    public String getValor(){
        return valor;
    }

    public void setValor(String valor){
        this.valor = valor;
    }

    public double getCalculo(){
        return (Double.parseDouble(valor) - 32) * 1.8;
    }
}