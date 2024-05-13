package com.bancolombia.extractos.extractos.controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bancolombia.extractos.extractos.model.Movimiento;
import com.bancolombia.extractos.extractos.service.MovimientoService;
import org.springframework.web.bind.annotation.RequestParam;


//@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
//@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE,RequestMethod.OPTIONS}, allowedHeaders = "*", allowCredentials = "true")

@RestController
@RequestMapping("api/v1/movimientos")
public class MovimientoController {

    @Autowired

    private MovimientoService movimientoService;

    //Metodo get
    @GetMapping
    public List<Movimiento> listarCuentas(){
        return movimientoService.getAllMovimientos();
    }

    //Metodo Post

    @PostMapping
    public Movimiento crear(@RequestBody Movimiento movimiento){

        return movimientoService.crearMovimiento(movimiento);

    }

    //put mapping
 
    @PostMapping("editar/{id}" )
    public Movimiento actualizar(@RequestBody Movimiento Movimiento, @PathVariable Long id){
        
        Movimiento.setId(id);
        return movimientoService.updaMovimiento(Movimiento);

        
    }

    //buscar por usuario
 
     @RequestMapping("buscar/{id}" )
     public List<Movimiento> getMovimientoByIdCuenta(@PathVariable Long id) {
        
        
        return movimientoService.getMovimientoByIdCuenta(id);
    }





   // Eliminar Cuenta
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        movimientoService.deleteMovimientoById(id);
    }
     


}
