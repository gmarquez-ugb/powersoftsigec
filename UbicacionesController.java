package com.powersoft.sigec.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.powersoft.sigec.model.entities.Ubicaciones;
import com.powersoft.sigec.models.repository.UbucacionesRepository;
import java.util.Optional;

@RestController
@RequestMapping("/ubicaciones")
public class UbicacionesController {
	@Autowired
	public UbucacionesRepository repository;
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public List<Ubicaciones> getUbicaciones(){
		 List<Ubicaciones> listado = (List<Ubicaciones>) repository.findAll();
		 return listado;
	}
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public Optional<Ubicaciones> obtenerCliente(@PathVariable("id") Long id){
	Optional<Ubicaciones> UbicacionesObjeto = repository.findById(id);
	return UbicacionesObjeto;
	}
	@RequestMapping(value="/", method = RequestMethod.POST)
	public Ubicaciones add(@RequestBody Ubicaciones entity){
	Ubicaciones objetoUbicaciones = repository.save(entity);
	return objetoUbicaciones;
	}
	@RequestMapping(value="/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id){
	repository.deleteById(id);
	}

}