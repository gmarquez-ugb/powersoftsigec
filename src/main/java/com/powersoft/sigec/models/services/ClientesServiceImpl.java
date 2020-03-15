package com.powersoft.sigec.models.services;


import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.powersoft.sigec.model.entities.Clientes;
import com.powersoft.sigec.models.repository.ClientesRepository;

@Service
public class ClientesServiceImpl implements ClientesService{
	@Autowired
	public ClientesRepository repository;
	
	@Override
	public List<Clientes> findAll(){
		return (List<Clientes>) repository.findAll();
	}
	
	
	public Clientes save(Clientes entity){
		return repository.save(entity);		  
	}
	
	  public Clientes edit(Clientes entity){
		return repository.save(entity);
	    }
	 
	public Optional<Clientes> findById(Long id){
		return repository.findById(id);
	}
	public void delete(Long id) {
		  repository.deleteById(id);
	}
}
