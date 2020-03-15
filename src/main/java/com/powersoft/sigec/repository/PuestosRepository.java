package com.powersoft.sigec.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.powersoft.sigec.model.entities.Puestos;

@Repository
public interface PuestosRepository extends
CrudRepository<Puestos, Long> {
}
