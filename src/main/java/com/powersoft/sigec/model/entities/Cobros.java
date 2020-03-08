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
@Table(name="cobros")
public class Cobros implements Serializable {
	private static final long serialVersionUID = 1L;
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_cliente", nullable=false)
	 private Clientes dui;
	 @ManyToOne(fetch = FetchType.LAZY)
	 @JoinColumn(name = "id_usuairo", nullable=false)
	 private Usuarios codigo;
	 @Column(length =255, name = "estado")
	 private String estado;
	 @Column(length =255, name = "fecha")
	 private String fecha;
	 @Column(length =255, name = "desde")
	 private String desde;
	 @Column(length =255, name = "hasta")
	 private String hasta; 

}

