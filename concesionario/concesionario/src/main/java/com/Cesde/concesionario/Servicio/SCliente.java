package com.Cesde.concesionario.Servicio;

import com.Cesde.concesionario.Modelo.MCliente;
import com.Cesde.concesionario.Repositorio.ICliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SCliente {
	private final ICliente objICliente;

	@Autowired
	public SCliente(ICliente objICliente) {
		this.objICliente = objICliente;
	}

	// Adicionar un registro cliente
	public MCliente adicionarCliente(MCliente cliente) {
		try {
			return objICliente.adicionarCliente(cliente);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo adicionar el cliente", exception);
		}
	}

	// Eliminar un registro cliente
	public void eliminarCliente(String idcliente) {
		try {
			objICliente.eliminarCliente(idcliente);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo eliminar el cliente", exception);
		}
	}

	// Actualizar un registro cliente
	public MCliente actualizarCliente(MCliente cliente) {
		try {
			return objICliente.actualizarCliente(cliente);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo actualizar el cliente", exception);
		}
	}

	// Consultar todos los registros cliente
	public List<MCliente> consultarTodosClientes() {
		try {
			return objICliente.consultarTodosClientes();
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudieron consultar los clientes", exception);
		}
	}

	// Consultar un registro cliente
	public Optional<MCliente> consultarCliente(String idcliente) {
		try {
			return objICliente.consultarCliente(idcliente);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo consultar el cliente", exception);
		}
	}

	// Consultar un cliente por nombre
	public Optional<MCliente> consultarClientePorNombre(String nomcliente) {
		try {
			return objICliente.findByNomcliente(nomcliente);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo consultar el cliente por nombre", exception);
		}
	}

	// Consultar un cliente por teléfono
	public Optional<MCliente> consultarClientePorTelefono(String telcliente) {
		try {
			return objICliente.findByTelcliente(telcliente);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo consultar el cliente por teléfono", exception);
		}
	}

	// Anular un cliente sin eliminarlo de la base de datos
	public Optional<MCliente> anularCliente(String idcliente) {
		try {
			return objICliente.anularCliente(idcliente);
		} catch (RuntimeException exception) {
			throw new IllegalStateException("No se pudo anular el cliente", exception);
		}
	}

}
