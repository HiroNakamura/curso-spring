package com.cursospringtwo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cursospringtwo.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
    Producto findByCodigo(String codigo);
}