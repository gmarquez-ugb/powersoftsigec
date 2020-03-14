package com.powersoft.sigec.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.powersoft.sigec.model.entities.Clientes;
import com.powersoft.sigec.models.repository.ClientesRepository;
import com.powersoft.sigec.models.services.ClientesService;
import com.powersoft.sigec.models.services.ClientesServiceImpl;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClientreController {
	@Autowired
	public ClientesRepository repository;
	
	@RequestMapping(value = "/busqueda", method = RequestMethod.GET)
	public List<Clientes> getClientes(){
		 List<Clientes> listado = (List<Clientes>) repository.findAll();
		 return listado;
	}
	
	@RequestMapping(value="/buscarid/{id}", method = RequestMethod.GET)
	public Optional<Clientes> obtenerCliente(@PathVariable("id") Long id){
	Optional<Clientes> clientesObjeto = repository.findById(id);
	return clientesObjeto;
	}
	@RequestMapping(value="/agregar", method = RequestMethod.POST)
	public Clientes add(@RequestBody Clientes entity){
	Clientes objetoClientes = repository.save(entity);
	return objetoClientes;
	}
	@RequestMapping(value="/eliminar/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id){
	repository.deleteById(id);
	}

}
