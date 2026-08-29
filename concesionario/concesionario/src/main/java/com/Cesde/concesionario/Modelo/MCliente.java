package com.Cesde.concesionario.Modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class MCliente {
    // Atributos
    @Id
    @Column(length = 15,nullable = false)
    private String idcliente;
    @Column(length = 100,nullable = false)
    private String nomcliente;
    @Column(length = 50,nullable = false)
    private String dircliente;
    @Column(length = 10,nullable = false)
    private String telcliente;
    @Column(nullable = false)
    private Boolean activo;

    // Relaciones entre clases

    // constructor


    public MCliente(String idcliente, String nomcliente, String dircliente, String telcliente, Boolean activo) {
        this.idcliente = idcliente;
        this.nomcliente = nomcliente;
        this.dircliente = dircliente;
        this.telcliente = telcliente;
        this.activo = activo;
    }

    public MCliente() {
    }

    // Encapsulamiento
    public String getIdcliente() {
        return idcliente;
    }
    public void setIdcliente(String idcliente) {
        this.idcliente = idcliente;
    }

    public String getNomcliente() {
        return nomcliente;
    }
    public void setNomcliente(String nomcliente) {
        this.nomcliente = nomcliente;
    }

    public String getDircliente() {
        return dircliente;
    }
    public void setDircliente(String dircliente) {
        this.dircliente = dircliente;
    }

    public String getTelcliente() {
        return telcliente;
    }
    public void setTelcliente(String telcliente) {
        this.telcliente = telcliente;
    }

    public Boolean getActivo() {
        return activo;
    }
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }
}
