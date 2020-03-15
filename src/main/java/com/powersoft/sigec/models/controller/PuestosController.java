package com.powersoft.sigec.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.powersoft.sigec.model.entities.Puestos;
import com.powersoft.sigec.models.repository.PuestosRepository;
import java.util.Optional;

@RestController
@RequestMapping("/puestos")
public class PuestosController {
	@Autowired
	public PuestosRepository repository;
	
	@RequestMapping(value = "/busqueda", method = RequestMethod.GET)
	public List<Puestos> getPuestos(){
		 List<Puestos> listado = (List<Puestos>) repository.findAll();
		 return listado;
	}
	
	@RequestMapping(value="/buscarid/{id}", method = RequestMethod.GET)
	public Optional<Puestos> obtenerCliente(@PathVariable("id") Long id){
	Optional<Puestos> PuestosObjeto = repository.findById(id);
	return PuestosObjeto;
	}
	@RequestMapping(value="/agregar", method = RequestMethod.POST)
	public Puestos add(@RequestBody Puestos entity){
	Puestos objetoPuestos = repository.save(entity);
	return objetoPuestos;
	}
	@RequestMapping(value="/eliminar/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id){
	repository.deleteById(id);
	}

}