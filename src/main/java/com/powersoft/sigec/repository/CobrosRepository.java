package com.powersoft.sigec.models.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.powersoft.sigec.model.entities.Cobros;

@Repository
public interface CobrosRepository extends
CrudRepository<Cobros, Long> {
}
