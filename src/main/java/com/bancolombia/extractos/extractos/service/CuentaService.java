package com.bancolombia.extractos.extractos.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.extractos.extractos.model.Cuenta;
import com.bancolombia.extractos.extractos.repository.CuentaRepository;

@Service
public class CuentaService {

    @Autowired 
    private CuentaRepository cuentaRepository;

    public List<Cuenta> getAllCuentas(){
        return cuentaRepository.findAll();

    }
    
    //crear cuentas 
    public Cuenta creaCuenta(Cuenta cuenta ){

        return cuentaRepository.save(cuenta);
    }
    
    //actualizar Cuenta

    public Cuenta updateCuenta(Cuenta cuenta ){

        return cuentaRepository.save(cuenta);
    } 
    
//eliminar cuenta
    public void deleteCuentaById(Long id){

    cuentaRepository.deleteById(id);
    }
}
