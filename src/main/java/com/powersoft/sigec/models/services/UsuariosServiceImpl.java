package com.powersoft.sigec.models.services;

import java.util.List;
import java.util.Optional;

import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.powersoft.sigec.model.entities.Clientes;
import com.powersoft.sigec.model.entities.Usuarios;
import com.powersoft.sigec.models.repository.UsuariosRepository;
@Service
@RestController
@RequestMapping("/usuarios")
public class UsuariosServiceImpl implements UsuariosService{
	@Autowired
	public UsuariosRepository repository;
	@Override
	public List<Usuarios> findAll(){
		 return (List<Usuarios>) repository.findAll();
	}
	
		public Usuarios save(Usuarios entity){
			return repository.save(entity);		  
		}
		  
		 
		public Optional<Usuarios> findById(Long id){
			return repository.findById(id);
		}
		public void delete(Long id) {
			  repository.deleteById(id);
		}
}
