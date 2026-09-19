package com.Cesde.concesionario.Servicio;

import com.Cesde.concesionario.Modelo.MVehiculoFactura;
import com.Cesde.concesionario.Repositorio.IVehiculoFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SVehiculoFactura {
	private final IVehiculoFactura objIVehiculoFactura;

	@Autowired
	public SVehiculoFactura(IVehiculoFactura objIVehiculoFactura) {
		this.objIVehiculoFactura = objIVehiculoFactura;
	}

	// Adicionar un registro vehiculo factura
	public MVehiculoFactura adicionarVehiculoFactura(MVehiculoFactura vehiculoFactura) {
		try {
			return objIVehiculoFactura.adicionarVehiculoFactura(vehiculoFactura);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo adicionar el vehiculo de la factura", exception);
		}
	}

	// Eliminar un registro vehiculo factura
	public void eliminarVehiculoFactura(Integer consecutivo) {
		try {
			objIVehiculoFactura.eliminarVehiculoFactura(consecutivo);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo eliminar el vehiculo de la factura", exception);
		}
	}

	// Actualizar un registro vehiculo factura
	public MVehiculoFactura actualizarVehiculoFactura(MVehiculoFactura vehiculoFactura) {
		try {
			return objIVehiculoFactura.actualizarVehiculoFactura(vehiculoFactura);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo actualizar el vehiculo de la factura", exception);
		}
	}

	// Consultar todos los registros vehiculo factura
	public List<MVehiculoFactura> consultarTodosVehiculosFactura() {
		try {
			return objIVehiculoFactura.consultarTodosVehiculosFactura();
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudieron consultar los vehiculos de las facturas", exception);
		}
	}

	// Consultar un registro vehiculo factura
	public Optional<MVehiculoFactura> consultarVehiculoFactura(Integer consecutivo) {
		try {
			return objIVehiculoFactura.consultarVehiculoFactura(consecutivo);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo consultar el vehiculo de la factura", exception);
		}
	}

}
