package com.Cesde.concesionario.Repositorio;

import com.Cesde.concesionario.Modelo.MFactura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/** Repositorio para administrar las facturas del concesionario. */
public interface IFactura extends JpaRepository<MFactura, Integer> {
	// Adicionar un registro factura
	default MFactura adicionarFactura(MFactura factura) {
		return save(factura);
	}

	// Eliminar un registro factura
	default void eliminarFactura(Integer codfactura) {
		deleteById(codfactura);
	}

	// Actualizar un registro factura
	default MFactura actualizarFactura(MFactura factura) {
		return save(factura);
	}

	// Consultar todos los registros factura
	default List<MFactura> consultarTodasFacturas() {
		return findAll();
	}

	// Consultar un registro factura
	default Optional<MFactura> consultarFactura(Integer codfactura) {
		return findById(codfactura);
	}
}
