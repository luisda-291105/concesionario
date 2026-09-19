package com.Cesde.concesionario.Repositorio;

import com.Cesde.concesionario.Modelo.MCliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

/** Repositorio para administrar clientes identificados por su documento. */
public interface ICliente extends JpaRepository<MCliente, String> {
	// Adicionar un registro cliente
	default MCliente adicionarCliente(MCliente cliente) {
		return save(cliente);
	}

	// Eliminar un registro cliente
	default void eliminarCliente(String idcliente) {
		deleteById(idcliente);
	}

	// Actualizar un registro cliente
	default MCliente actualizarCliente(MCliente cliente) {
		return save(cliente);
	}

	// Consultar todos los registros cliente
	default List<MCliente> consultarTodosClientes() {
		return findAll();
	}

	// Consultar un registro cliente
	default Optional<MCliente> consultarCliente(String idcliente) {
		return findById(idcliente);
	}

	// Consultar un cliente por nombre
	Optional<MCliente> findByNomcliente(String nomcliente);

	// Consultar un cliente por teléfono
	Optional<MCliente> findByTelcliente(String telcliente);

	// Anular un cliente sin eliminarlo de la base de datos
	default Optional<MCliente> anularCliente(String idcliente) {
		Optional<MCliente> cliente = findById(idcliente);
		if (cliente.isEmpty()) {
			return Optional.empty();
		}

		MCliente clienteEncontrado = cliente.get();
		clienteEncontrado.setActivo(false);
		return Optional.of(save(clienteEncontrado));
	}
}
