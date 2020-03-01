package com.powersoft.sigec.model.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
public class Puestos {
	 @Id
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
	 @Column(length =255, name = "id_ubicacion")
	 private String id_ubicacion;

}
