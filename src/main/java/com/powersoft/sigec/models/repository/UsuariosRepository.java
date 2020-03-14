package com.powersoft.sigec.models.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.powersoft.sigec.model.entities.Usuarios;

@Repository
public interface UsuariosRepository extends CrudRepository<Usuarios, Long> {
	 @Query("SELECT u FROM Usuarios u where u.correo = :correo AND u.contraseña = :contraseña AND estado = 1")
	    public Usuarios login(@Param("correo")String correo, @Param("contraseña")String clave); 
}