package com.cursospring.model;

import java.math.BigDecimal;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name="Cupon")
@Table(name="cupon")
public class Cupon{
    private Long id;
    private String codigo;
    private BigDecimal descuento;
    private String fecha;

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getCodigo(){
        return codigo;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public BigDecimal getDescuento(){
        return descuento;
    }

    public void setDescuento(BigDecimal descuento){
        this.descuento = descuento;
    }

    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cupon{");
        sb.append("id: ");
        sb.append(this.id);
        sb.append(", codigo: ");
        sb.append(this.codigo);
        sb.append(", descuento: ");
        sb.append(this.descuento);
        sb.append(", fecha: ");
        sb.append(this.fecha);
        sb.append("}");
        return sb.toString();
    }
}