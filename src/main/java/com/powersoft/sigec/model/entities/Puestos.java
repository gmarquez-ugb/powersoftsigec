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
	 
	 @Column(length =255, name = "id_puesto")
	 private String id_puesto;
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

}
