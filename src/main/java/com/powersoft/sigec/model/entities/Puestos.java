package com.powersoft.sigec.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;

@Entity
@Table(name="puestos")
public class Puestos implements Serializable {
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	@Column(length =255, name = "numero")
	 private String numero;
	 @Column(length =255, name = "medidas")
	 private String medidas;
	 @Column(length =255, name = "tipo")
	 private String tipo;
	 @Column(length =255, name = "valor")
	 private String valor;
	 @Column(length =255, name = "estado")
	 private String estado;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_ubicacion", nullable=false)
	 private Ubicaciones id_ubicacion;
	 
	 public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getMedidas() {
		return medidas;
	}
	public void setMedidas(String medidas) {
		this.medidas = medidas;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Ubicaciones getId_ubicacion() {
		return id_ubicacion;
	}
	public void setId_ubicacion(Ubicaciones id_ubicacion) {
		this.id_ubicacion = id_ubicacion;
	}
}
