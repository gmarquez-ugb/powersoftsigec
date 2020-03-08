package com.powersoft.sigec.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.powersoft.sigec.model.entities.Usuarios;

@Repository
public interface UsuariosRepository extends
CrudRepository<Usuarios, Long> {
}