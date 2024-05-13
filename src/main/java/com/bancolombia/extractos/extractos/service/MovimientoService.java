package com.bancolombia.extractos.extractos.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancolombia.extractos.extractos.model.Movimiento;
import com.bancolombia.extractos.extractos.repository.MovimientoRepository;

@Service
public class MovimientoService {
    @Autowired 
    private MovimientoRepository movimientoRepository;
     private static final Logger logger = LoggerFactory.getLogger(MovimientoService.class);

    public List<Movimiento> getAllMovimientos(){
        return movimientoRepository.findAll();

    }
    
    //crear Movimiento 
    public Movimiento crearMovimiento(Movimiento movimiento ){

        return movimientoRepository.save(movimiento);
    }
    
    //actualizar Movimiento

    public Movimiento updaMovimiento(Movimiento movimiento ){

        return movimientoRepository.save(movimiento);
    } 
    //buscar por id    
    public List<Movimiento> getMovimientoByIdCuenta(Long cuentaId) {
    
        
        List<Movimiento> movimientos = movimientoRepository.findByCuentaId(cuentaId);
        
        return movimientos;

    }


//eliminar movimiento
    public void deleteMovimientoById(Long id){

        movimientoRepository.deleteById(id);
    }


}
