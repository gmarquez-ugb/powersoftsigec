package com.powersoft.sigec.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.powersoft.sigec.model.entities.Clientes;

@Repository
public interface ClientesRepository extends JpaRepository<Clientes, Long> {
	
}

