package com.powersoft.sigec.models.services;

import java.util.List;
import java.util.Optional;

import com.powersoft.sigec.model.entities.Usuarios;

public interface UsuariosService {
public List<Usuarios> findAll();
	
	public Usuarios save(Usuarios entity);
	
	public Optional<Usuarios> findById(Long id);
	
	public void delete(Long id);

}
