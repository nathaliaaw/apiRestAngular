package com.bolsadeideas.backendapirest.models.services;

import java.util.List;

import com.bolsadeideas.backendapirest.models.entity.Cliente;

public interface IClientesService {
	public List<Cliente> findAll();

	public Cliente findById(Long id);

	public Cliente save(Cliente cliente);

	public void delete(Long id);
}
