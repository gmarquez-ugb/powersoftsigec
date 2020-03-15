package com.powersoft.sigec.models.services;

import java.util.List;
import java.util.Optional;

import com.powersoft.sigec.model.entities.Cobros;

public interface CobrosService {
	public List<Cobros> findAll();
	
	public Cobros save(Cobros entity);
	
	public Optional<Cobros> findById(Long id);
	
	public void delete(Long id);

}
