package com.powersoft.sigec.model.entities;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes implements Serializable {
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @Column(length =255, name = "dui")
	 private String dui;
	 @Column(length =255, name = "nombre")
	 private String nombre;
	 @Column(length =255, name = "apellidos")
	 private String apellidos;
	 @Column(length =255, name = "correo")
	 private String correo;
	 @Column(length =255, name = "contraseña")
	 private String contraseña;
	 @Column(length =255, name = "telefono")
	 private String telefono;
	 @Column(length =255, name = "direccion")
	 private String estado;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_puesto", nullable=false)
	 private Puestos puesto;

}
