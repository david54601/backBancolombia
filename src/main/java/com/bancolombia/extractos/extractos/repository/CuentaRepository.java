package com.bancolombia.extractos.extractos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bancolombia.extractos.extractos.model.Cuenta;



public interface CuentaRepository  extends JpaRepository<Cuenta, Long>{

    


}
