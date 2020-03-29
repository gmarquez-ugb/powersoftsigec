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

@SuppressWarnings("unused")
@Entity
@Table(name="cobros")
public class Cobros implements Serializable {
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
	public Usuarios getCodigo() {
		return id_usuario;
	}
	public void setCodigo(Usuarios id_usuario) {
		this.id_usuario = id_usuario;
	}
	public Arrendamientos getId_arrendamiento() {
		return id_arrendamiento;
	}
	public void setId_arrendamiento(Arrendamientos id_arrendamiento) {
		this.id_arrendamiento = id_arrendamiento;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getFechaCobro() {
		return fechaCobro;
	}
	public void setFechaCobro(String fechaCobro) {
		this.fechaCobro = fechaCobro;
	}
	public String getDesde() {
		return desde;
	}
	public void setDesde(String desde) {
		this.desde = desde;
	}
	public String getHasta() {
		return hasta;
	}
	public void setHasta(String hasta) {
		this.hasta = hasta;
	}
	@ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_usuario", nullable=false)
	 private Usuarios id_usuario ;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_arrendamiento", nullable=false)
	 private Arrendamientos id_arrendamiento ;
	 @Column(length =255, name = "estado")
	 private String estado;
	 @Column(length =255, name = "fecha")
	 private String fechaCobro;
	 @Column(length =255, name = "desde")
	 private String desde;
	 @Column(length =255, name = "hasta")
	 private String hasta; 
	 
	 
}

