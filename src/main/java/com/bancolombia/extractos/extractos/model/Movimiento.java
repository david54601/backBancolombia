package com.bancolombia.extractos.extractos.model;

import java.sql.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Movimientos")
public class Movimiento {


    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id; 


       @Column(name="tipo_cuenta")
    private String tipoCuenta;
    

    @Column(name="descripcion")
    private String descripcion;
    
    @Column(name="dcto")
    private double dcto;
    
    @Column(name="valor")
    private double valor;

    @Column(name="total")
    private double total;

    @Column(name="fecha")
    private Date fecha;

    @Column(name="tipo_transaccion")
    private String TipoTransaccion;

    @Column(name="metodo_pago")
    private String metodoPago;

    @ManyToOne
    @JoinColumn(name="cuenta_id")
    private Cuenta cuenta;

}
