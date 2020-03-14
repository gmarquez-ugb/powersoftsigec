package com.powersoft.sigec.models.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.powersoft.sigec.model.entities.Ubicaciones;
import com.powersoft.sigec.models.repository.UbucacionesRepository;

@Service
public class UbicacionesServiceImpl implements UbicacionesService{
	@Autowired
	public UbucacionesRepository repository;

	public List<Ubicaciones> findAll(){
		 return (List<Ubicaciones>) repository.findAll();
	
	}
	
	public Ubicaciones save(Ubicaciones entity){
		return repository.save(entity);		  
	}
	 
	public Optional<Ubicaciones> findById(Long id){
		return repository.findById(id);
	}
	public void delete(Long id) {
		  repository.deleteById(id);
		 
	}

}
