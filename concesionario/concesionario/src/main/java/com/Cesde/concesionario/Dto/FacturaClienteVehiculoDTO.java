package com.Cesde.concesionario.Dto;

import java.time.LocalDate;

public class FacturaClienteVehiculoDTO {
    private final String nomcliente;
    private final String dircliente;
    private final Integer codfactura;
    private final LocalDate fecha;
    private final String placa;
    private final Double valventa;
    private final String marca;

    public FacturaClienteVehiculoDTO(String nomcliente, String dircliente, Integer codfactura,
                                     LocalDate fecha, String placa, Double valventa, String marca) {
        this.nomcliente = nomcliente;
        this.dircliente = dircliente;
        this.codfactura = codfactura;
        this.fecha = fecha;
        this.placa = placa;
        this.valventa = valventa;
        this.marca = marca;
    }

    public String getNomcliente() {
        return nomcliente;
    }

    public String getDircliente() {
        return dircliente;
    }

    public Integer getCodfactura() {
        return codfactura;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getPlaca() {
        return placa;
    }

    public Double getValventa() {
        return valventa;
    }

    public String getMarca() {
        return marca;
    }
}
