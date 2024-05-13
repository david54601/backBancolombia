package com.bancolombia.extractos.extractos.controller;

import java.util.List;

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

import com.bancolombia.extractos.extractos.model.Cuenta;
import com.bancolombia.extractos.extractos.service.CuentaService;

//@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT})
//@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@CrossOrigin(origins = "http://localhost:3000", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE,RequestMethod.OPTIONS}, allowedHeaders = "*", allowCredentials = "true")

@RestController
@RequestMapping("api/v1/cuentas")
public class CuentaController {

    @Autowired

    private CuentaService cuentaService;

    //Metodo get
    @GetMapping
    public List<Cuenta> listarCuentas(){
        return cuentaService.getAllCuentas();
    }

    //Metodo Post

    @PostMapping
    public Cuenta crear(@RequestBody Cuenta cuenta){

        return cuentaService.creaCuenta(cuenta);

    }

    //put mapping

    @PostMapping("editar/{id}" )
    public Cuenta actualizar(@RequestBody Cuenta cuenta, @PathVariable Long id){
        
        cuenta.setId(id);
        return cuentaService.updateCuenta(cuenta);

        
    }

   // Eliminar Cuenta
    @DeleteMapping("eliminar/{id}")
    public void eliminar(@PathVariable Long id){
        cuentaService.deleteCuentaById(id);
    }
     


}
