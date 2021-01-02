package com.cursospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cursospring.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    Producto findByCodigo(String codigo);
}