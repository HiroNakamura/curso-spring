package com.producto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.producto.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
}