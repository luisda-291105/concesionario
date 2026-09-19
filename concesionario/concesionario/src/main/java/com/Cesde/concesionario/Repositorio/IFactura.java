package com.Cesde.concesionario.Repositorio;

import com.Cesde.concesionario.Dto.FacturaClienteVehiculoDTO;
import com.Cesde.concesionario.Modelo.MCliente;
import com.Cesde.concesionario.Modelo.MFactura;
import com.Cesde.concesionario.Modelo.MVehiculo;
import com.Cesde.concesionario.Modelo.MVehiculoFactura;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

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

	// Consultar las facturas y vehículos comprados por un cliente
	@Query("SELECT new com.Cesde.concesionario.Dto.FacturaClienteVehiculoDTO(" +
			"c.nomcliente, c.dircliente, f.codfactura, f.fecha, vf.placa, vf.valventa, v.marca) " +
			"FROM MFactura f, MCliente c, MVehiculoFactura vf, MVehiculo v " +
			"WHERE f.idcliente = c.idcliente " +
			"AND vf.codfactura = f.codfactura " +
			"AND vf.placa = v.placa " +
			"AND c.idcliente = :idcliente " +
			"AND f.activo = true")
	List<FacturaClienteVehiculoDTO> consultarFacturasClienteConVehiculos(@Param("idcliente") String idcliente);
}
