package com.powersoft.sigec.models.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.powersoft.sigec.model.entities.Usuarios;
import com.powersoft.sigec.models.repository.UsuariosRepository;
import java.util.Optional;

@RestController
@RequestMapping("/usuarios")
public class UsuariosController {
	@Autowired
	public UsuariosRepository repository;
	
	@RequestMapping(value = "/busqueda", method = RequestMethod.GET)
	public List<Usuarios> getUsuarios(){
		 List<Usuarios> listado = (List<Usuarios>) repository.findAll();
		 return listado;
	}
	
	@RequestMapping(value="/buscarid/{id}", method = RequestMethod.GET)
	public Optional<Usuarios> obtenerCliente(@PathVariable("id") Long id){
	Optional<Usuarios> UsuariosObjeto = repository.findById(id);
	return UsuariosObjeto;
	}
	@RequestMapping(value="/agregar", method = RequestMethod.POST)
	public Usuarios add(@RequestBody Usuarios entity){
	Usuarios objetoUsuarios = repository.save(entity);
	return objetoUsuarios;
	}
	@RequestMapping(value="/eliminar/{id}", method = RequestMethod.DELETE)
	public void deleteById(@PathVariable("id") Long id){
	repository.deleteById(id);
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
    public Usuarios login(@RequestBody(required = true)Usuarios entity){
        return repository.login(entity.getCorreo(), entity.getContraseña());
    }

}