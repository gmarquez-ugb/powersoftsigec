package com.powersoft.sigec.models.services;

import java.util.List;
import java.util.Optional;
import com.powersoft.sigec.model.entities.Arrendamientos;

public interface ArrendamientosService {
	public List<Arrendamientos> findAll();
	
	public Arrendamientos save(Arrendamientos entity);
	
	public Optional<Arrendamientos> findById(Long id);
	
	public void delete(Long id);
}
