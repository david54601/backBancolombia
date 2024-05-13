package com.bancolombia.extractos.extractos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bancolombia.extractos.extractos.model.Movimiento;

public interface MovimientoRepository  extends JpaRepository<Movimiento, Long >{
    
   
    List<Movimiento> findByCuentaId(Long id);

}
