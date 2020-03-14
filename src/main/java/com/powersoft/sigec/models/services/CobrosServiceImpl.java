package com.powersoft.sigec.models.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.powersoft.sigec.model.entities.Cobros;
import com.powersoft.sigec.models.repository.CobrosRepository;
@Service
public class CobrosServiceImpl  implements CobrosService{
	@Autowired
	public CobrosRepository repository;

	public List<Cobros> findAll(){
		return (List<Cobros>) repository.findAll();
		
	}
	
	public Cobros save(Cobros entity){
		return repository.save(entity);		  
	}
	 
	public Optional<Cobros> findById(Long id){
		return repository.findById(id);
	}
	public void delete(Long id) {
		  repository.deleteById(id);
		 
	}
}
