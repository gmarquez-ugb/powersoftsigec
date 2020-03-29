package com.powersoft.sigec.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("unused")
@Entity
@Table(name="ubicaciones")
public class Ubicaciones implements Serializable {
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 @Column(length =255, name = "ubicacion")
	 private String ubicacion;
	 @Column(length =255, name = "descripcion")
	 private String descripcion;
	 
	 public Long getId() 
	 {return id;}			
	 public void setId(Long id) 
	 {this.id = id;}
	 
	 public String getUbicacion() 
	 {return ubicacion;}			
	 public void setUbicacion(String ubicacion) 
	 {this.ubicacion = ubicacion;}
	 
	 public String getDescripcion() 
	 {return descripcion;}			
	 public void setDescripcion(String descripcion) 
	 {this.descripcion = descripcion;}
	 
}