package com.Cesde.concesionario.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "factura")
public class MFactura {
    // Atributos
    @Id
    private Integer codfactura;
    @Column(nullable = false)
    private LocalDate fecha;
    @Column(length = 15,nullable = false)
    private String idcliente;
    @Column(nullable = false)
    private Boolean activo;

    // Relaciones entre tablas

    // Encapsulamiento
    public Integer getCodfactura() {
        return codfactura;
    }
    public void setCodfactura(Integer codfactura) {
        this.codfactura = codfactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public Boolean getActivo() {
        return activo;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
