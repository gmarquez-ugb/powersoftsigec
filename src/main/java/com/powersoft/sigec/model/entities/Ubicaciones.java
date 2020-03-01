package com.powersoft.sigec.model.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Column;
import javax.persistence.Id;

@Entity
public class Ubicaciones {
	 @Id
	 private Long id;
	 
	 @Column(length =255, name = "id_ubicacion")
	 private String id_ubicacion;
	 @Column(length =255, name = "ubicacion")
	 private String ubicacion;
	 @Column(length =255, name = "descripcion")
	 private String descripcion;
}