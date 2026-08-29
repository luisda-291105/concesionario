package com.Cesde.concesionario.Modelo;

import jakarta.persistence.*;

@Entity
@Table(name = "vehiculofactura")
public class MVehiculoFactura {
    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer consecutivo;
    @Column(nullable = false)
    private Integer codfactura;
    @Column(length = 6,nullable = false)
    private String placa;
    @Column(nullable = false)
    private Double valventa;

    // Relacion entre las tablas

    // Encapsulamiento
    public Integer getConsecutivo() {
        return consecutivo;
    }
    public void setConsecutivo(Integer consecutivo) {
        this.consecutivo = consecutivo;
    }

    public Integer getCodfactura() {
        return codfactura;
    }
    public void setCodfactura(Integer codfactura) {
        this.codfactura = codfactura;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Double getValventa() {
        return valventa;
    }
    public void setValventa(Double valventa) {
        this.valventa = valventa;
    }
}
