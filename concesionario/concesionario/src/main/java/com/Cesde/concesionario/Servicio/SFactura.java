package com.Cesde.concesionario.Servicio;

import com.Cesde.concesionario.Dto.FacturaClienteVehiculoDTO;
import com.Cesde.concesionario.Modelo.MFactura;
import com.Cesde.concesionario.Repositorio.IFactura;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class SFactura {
	private final IFactura objIFactura;

	@Autowired
	public SFactura(IFactura objIFactura) {
		this.objIFactura = objIFactura;
	}

	// Adicionar un registro factura
	public MFactura adicionarFactura(MFactura factura) {
		try {
			return objIFactura.adicionarFactura(factura);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo adicionar la factura", exception);
		}
	}

	// Eliminar un registro factura
	public void eliminarFactura(Integer codfactura) {
		try {
			objIFactura.eliminarFactura(codfactura);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo eliminar la factura", exception);
		}
	}

	// Actualizar un registro factura
	public MFactura actualizarFactura(MFactura factura) {
		try {
			return objIFactura.actualizarFactura(factura);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo actualizar la factura", exception);
		}
	}

	// Consultar todos los registros factura
	public List<MFactura> consultarTodasFacturas() {
		try {
			return objIFactura.consultarTodasFacturas();
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudieron consultar las facturas", exception);
		}
	}

	// Consultar un registro factura
	public Optional<MFactura> consultarFactura(Integer codfactura) {
		try {
			return objIFactura.consultarFactura(codfactura);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo consultar la factura", exception);
		}
	}

	// Consultar facturas y vehículos comprados por un cliente
	public List<FacturaClienteVehiculoDTO> consultarFacturasClienteConVehiculos(String idcliente) {
		try {
			return objIFactura.consultarFacturasClienteConVehiculos(idcliente).stream()
					.map(this::convertirFacturaClienteVehiculo)
					.toList();
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudieron consultar las facturas del cliente", exception);
		}
	}

	private FacturaClienteVehiculoDTO convertirFacturaClienteVehiculo(Object[] datos) {
		return new FacturaClienteVehiculoDTO(
				(String) datos[0],
				(String) datos[1],
				((Number) datos[2]).intValue(),
				convertirFecha(datos[3]),
				(String) datos[4],
				((Number) datos[5]).doubleValue(),
				(String) datos[6]);
	}

	private LocalDate convertirFecha(Object fecha) {
		if (fecha instanceof java.sql.Date fechaSql) {
			return fechaSql.toLocalDate();
		}
		return (LocalDate) fecha;
	}

}
