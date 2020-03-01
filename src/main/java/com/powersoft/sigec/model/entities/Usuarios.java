package com.powersoft.sigec.model.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

 @Entity
public class Usuarios {
	 @Id
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

