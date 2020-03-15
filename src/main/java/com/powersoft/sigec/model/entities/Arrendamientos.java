package com.powersoft.sigec.model.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="arrendamientos")
public class Arrendamientos implements Serializable {
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Clientes getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Clientes id_cliente) {
		this.id_cliente = id_cliente;
	}
	public Puestos getId_puestos() {
		return id_puestos;
	}
	public void setId_puestos(Puestos id_puestos) {
		this.id_puestos = id_puestos;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_cliente", nullable=false)
	 private Clientes id_cliente;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_puestos", nullable=false)
	 private Puestos id_puestos;
	 @Column(length =255, name = "fecha")
	 private String fecha;
	 
}
