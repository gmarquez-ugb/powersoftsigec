package com.powersoft.sigec.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.powersoft.sigec.model.entities.Arrendamientos;
import com.powersoft.sigec.models.repository.ArrendamientosRepository;
import com.powersoft.sigec.models.services.ArrendamientosService;
import com.powersoft.sigec.models.services.ArrendamientosServiceImpl;
import java.util.Optional;

@RestController
@RequestMapping("/arrendamientos")
public class ArrendamientosController {
	@Autowired
	public ArrendamientosRepository repository;
	
	@RequestMapping(value = "/busqueda", method = RequestMethod.GET)
	public List<Arrendamientos> getArrendamientos(){
		 List<Arrendamientos> listado = (List<Arrendamientos>) repository.findAll();
		 return listado;
	}
	
	@RequestMapping(value="/buscarid/{id}", method = RequestMethod.GET)
	public Optional<Arrendamientos> obtenerCliente(@PathVariable("id") Long id){
	Optional<Arrendamientos> ArrendamientosObjeto = repository.findById(id);
	return ArrendamientosObjeto;
	}
	@RequestMapping(value="/agregar", method = RequestMethod.POST)
	public Arrendamientos add(@RequestBody Arrendamientos entity){
	Arrendamientos objetoArrendamientos = repository.save(entity);
	return objetoArrendamientos;
	}
	@RequestMapping(value="/eliminar/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id){
	repository.deleteById(id);
	}

}