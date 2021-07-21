package com.bolsadeideas.backendapirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.backendapirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long> {

}
