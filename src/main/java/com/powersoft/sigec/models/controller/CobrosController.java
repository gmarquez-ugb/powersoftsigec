package com.powersoft.sigec.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.powersoft.sigec.model.entities.Cobros;
import com.powersoft.sigec.models.repository.CobrosRepository;
import java.util.Optional;

@RestController
@RequestMapping("/cobros")
public class CobrosController {
	@Autowired
	public CobrosRepository repository;
	
	@RequestMapping(value = "/busqueda", method = RequestMethod.GET)
	public List<Cobros> getCobros(){
		 List<Cobros> listado = (List<Cobros>) repository.findAll();
		 return listado;
	}
	
	@RequestMapping(value="/buscarid/{id}", method = RequestMethod.GET)
	public Optional<Cobros> obtenerCliente(@PathVariable("id") Long id){
	Optional<Cobros> CobrosObjeto = repository.findById(id);
	return CobrosObjeto;
	}
	@RequestMapping(value="/agregar", method = RequestMethod.POST)
	public Cobros add(@RequestBody Cobros entity){
	Cobros objetoCobros = repository.save(entity);
	return objetoCobros;
	}
	@RequestMapping(value="/eliminar/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id){
	repository.deleteById(id);
	}

}