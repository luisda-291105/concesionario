package com.Cesde.concesionario.Servicio;

import com.Cesde.concesionario.Modelo.MVehiculo;
import com.Cesde.concesionario.Repositorio.IVehiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SVehiculo {
	private final IVehiculo objIVehiculo;

	@Autowired
	public SVehiculo(IVehiculo objIVehiculo) {
		this.objIVehiculo = objIVehiculo;
	}

	// Adicionar un registro vehiculo
	public MVehiculo adicionarVehiculo(MVehiculo vehiculo) {
		try {
			return objIVehiculo.adicionarVehiculo(vehiculo);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo adicionar el vehiculo", exception);
		}
	}

	// Eliminar un registro vehiculo
	public void eliminarVehiculo(String placa) {
		try {
			objIVehiculo.eliminarVehiculo(placa);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo eliminar el vehiculo", exception);
		}
	}

	// Actualizar un registro vehiculo
	public MVehiculo actualizarVehiculo(MVehiculo vehiculo) {
		try {
			return objIVehiculo.actualizarVehiculo(vehiculo);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo actualizar el vehiculo", exception);
		}
	}

	// Consultar todos los registros vehiculo
	public List<MVehiculo> consultarTodosVehiculos() {
		try {
			return objIVehiculo.consultarTodosVehiculos();
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudieron consultar los vehiculos", exception);
		}
	}

	// Consultar un registro vehiculo
	public Optional<MVehiculo> consultarVehiculo(String placa) {
		try {
			return objIVehiculo.consultarVehiculo(placa);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo consultar el vehiculo", exception);
		}
	}

}
