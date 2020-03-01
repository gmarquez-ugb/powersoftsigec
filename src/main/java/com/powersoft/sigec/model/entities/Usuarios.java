package com.powersoft.sigec.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

 @Entity
 @Table(name="usuarios")
 public class Usuarios implements Serializable {
 	private static final long serialVersionUID = 1L;
 	 @Id
 	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(length =255, name = "codigo")
	 private String codigo;
	 @Column(length =255, name = "nombre")
	 private String nombre;
	 @Column(length =255, name = "correo")
	 private String correo;
	 @Column(length =255, name = "contraseña")
	 private String contraseña;
	 @Column(length =255, name = "telefono")
	 private String telefono;
	 @Column(length =255, name = "nivel")
	 private String nivel;
	 @Column(length =255, name = "estado")
	 private String estado;

}

