package com.cursospring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cursospring.model.Cupon;

public interface CuponRepository extends JpaRepository<Cupon, Long>{
    
}