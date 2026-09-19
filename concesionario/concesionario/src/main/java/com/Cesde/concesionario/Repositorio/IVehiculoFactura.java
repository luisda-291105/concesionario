package com.Cesde.concesionario.Repositorio;

import com.Cesde.concesionario.Modelo.MVehiculoFactura;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/** Repositorio para administrar los vehículos asociados a facturas. */
public interface IVehiculoFactura extends JpaRepository<MVehiculoFactura, Integer> {
	// Adicionar un registro vehiculo factura
	default MVehiculoFactura adicionarVehiculoFactura(MVehiculoFactura vehiculoFactura) {
		return save(vehiculoFactura);
	}

	// Eliminar un registro vehiculo factura
	default void eliminarVehiculoFactura(Integer consecutivo) {
		deleteById(consecutivo);
	}

	// Actualizar un registro vehiculo factura
	default MVehiculoFactura actualizarVehiculoFactura(MVehiculoFactura vehiculoFactura) {
		return save(vehiculoFactura);
	}

	// Consultar todos los registros vehiculo factura
	default List<MVehiculoFactura> consultarTodosVehiculosFactura() {
		return findAll();
	}

	// Consultar un registro vehiculo factura
	default Optional<MVehiculoFactura> consultarVehiculoFactura(Integer consecutivo) {
		return findById(consecutivo);
	}
}
