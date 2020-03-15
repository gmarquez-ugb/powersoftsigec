package com.powersoft.sigec.models.services;

import java.util.List;
import java.util.Optional;

import com.powersoft.sigec.model.entities.Ubicaciones;

public interface UbicacionesService {
public List<Ubicaciones> findAll();
	
	public Ubicaciones save(Ubicaciones entity);
	
	public Optional<Ubicaciones> findById(Long id);
	
	public void delete(Long id);

}
