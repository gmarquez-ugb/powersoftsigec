package com.powersoft.sigec.models.services;

import java.util.List;
import java.util.Optional;

import com.powersoft.sigec.model.entities.Puestos;

public interface PuestosService {
	public List<Puestos> findAll();
	
	public Puestos save(Puestos entity);
	
	public Optional<Puestos> findById(Long id);
	
	public void delete(Long id);
}
