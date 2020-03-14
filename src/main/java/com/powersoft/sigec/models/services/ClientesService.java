package com.powersoft.sigec.models.services;

import java.util.List;
import java.util.Optional;

import com.powersoft.sigec.model.entities.Clientes;
public interface ClientesService {
	  
	   public List<Clientes> findAll();
		
		public Clientes save(Clientes entity);
		
		public Optional<Clientes> findById(Long id);
		
		public void delete(Long id);
}

