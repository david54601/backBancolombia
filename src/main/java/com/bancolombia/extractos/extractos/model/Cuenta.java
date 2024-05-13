package com.bancolombia.extractos.extractos.model;

import java.sql.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table(name="Cuentas")
public class Cuenta {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 
    
    @Column(name="tipo_cuenta")
    private String tipoCuenta;
    

    @Column(name="saldo")
    private double saldo;
    
    @Column(name="titular")
    private String titular;
    
    @Column(name="fecha_apertura")
    private Date fecha;

    @Column(name="sucursal")
    private String sucursal;

    @Column(name="moneda")
    private String moneda;

    @Column(name="tasa_interes")
    private double tasaInteres;

    @Column(name="estado")
    private double estado;



}
