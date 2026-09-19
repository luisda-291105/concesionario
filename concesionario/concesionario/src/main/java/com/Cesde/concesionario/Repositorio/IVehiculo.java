package com.Cesde.concesionario.Repositorio;

import com.Cesde.concesionario.Modelo.MVehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/** Repositorio para administrar vehículos identificados por su placa. */
public interface IVehiculo extends JpaRepository<MVehiculo, String> {
	// Adicionar un registro vehiculo
	default MVehiculo adicionarVehiculo(MVehiculo vehiculo) {
		return save(vehiculo);
	}

	// Eliminar un registro vehiculo
	default void eliminarVehiculo(String placa) {
		deleteById(placa);
	}

	// Actualizar un registro vehiculo
	default MVehiculo actualizarVehiculo(MVehiculo vehiculo) {
		return save(vehiculo);
	}

	// Consultar todos los registros vehiculo
	default List<MVehiculo> consultarTodosVehiculos() {
		return findAll();
	}

	// Consultar un registro vehiculo
	default Optional<MVehiculo> consultarVehiculo(String placa) {
		return findById(placa);
	}
}
