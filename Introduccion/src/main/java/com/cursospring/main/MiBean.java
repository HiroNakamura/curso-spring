package com.cursospring.main;


public class MiBean {
	private String valor;

	private MiBean(){
		System.out.println("Objeto MiBean creado e inicializado");
	}

	public MiBean(String valor){
		super();
		this.valor = valor;
	}

	public String getValor(){
		return valor;
	}

	public void setValor(String valor){
		this.valor = valor;
	}

	@Override
	public String toString(){
		return "MiBean{ valor: "+this.valor+"}";
	}
}