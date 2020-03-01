package com.powersoft.sigec.model.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Cobros {
	 @Id
	 private Long id;
	 
	 @Column(length =255, name = "id_cobro")
	 private String id_cobro;
	 @Column(length =255, name = "id_cliente")
	 private String id_cliente;
	 @Column(length =255, name = "id_usuario")
	 private String id_usuario;
	 @Column(length =255, name = "estado")
	 private String estado;
	 @Column(length =255, name = "fecha")
	 private String fecha;
	 @Column(length =255, name = "desde")
	 private String desde;
	 @Column(length =255, name = "hasta")
	 private String hasta; 

}

