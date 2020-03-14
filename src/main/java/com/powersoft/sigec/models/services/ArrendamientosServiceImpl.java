package com.powersoft.sigec.models.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.powersoft.sigec.model.entities.Arrendamientos;
import com.powersoft.sigec.models.repository.ArrendamientosRepository;

@Service
public class ArrendamientosServiceImpl implements ArrendamientosService{
	@Autowired
	public ArrendamientosRepository repository;
	
	public List<Arrendamientos> findAll(){
		return (List<Arrendamientos>) repository.findAll();
		}
		
	public Arrendamientos save(Arrendamientos entity) {
		return repository.save(entity);
	}
	
	public Optional<Arrendamientos> findById(Long id){
		return  repository.findById(id);
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
		
	}
	

}
