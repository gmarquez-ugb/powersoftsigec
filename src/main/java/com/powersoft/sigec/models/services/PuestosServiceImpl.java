package com.powersoft.sigec.models.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.powersoft.sigec.model.entities.Puestos;
import com.powersoft.sigec.models.repository.PuestosRepository;
@Service
public class PuestosServiceImpl implements PuestosService{
	@Autowired
	public PuestosRepository repository;

	public List<Puestos> findAll(){
		 return (List<Puestos>) repository.findAll();
	}
	
	public Puestos save(Puestos entity){
		return repository.save(entity);		  
	}
	 
	public Optional<Puestos> findById(Long id){
		return repository.findById(id);
	}
	public void delete(Long id) {
		  repository.deleteById(id);
		 
	}

}
