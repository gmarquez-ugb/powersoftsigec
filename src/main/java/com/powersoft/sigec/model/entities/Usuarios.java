package com.powersoft.sigec.model.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;

 @SuppressWarnings("unused")
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
	 @Column(length =255, name = "contraseÃ±a")
	 private String contraseña;
	 @Column(length =255, name = "telefono")
	 private String telefono;
	 @Column(length =255, name = "nivel")
	 private String nivel;
	 @Column(length =255, name = "estado")
	 private String estado; 

	 public Long getId() 
	 {return id;}			
	 public void setId(Long id) 
	 {this.id = id;}
	 
	 public String getCodigo() 
	 {return codigo;}			
	 public void setCodigo(String codigo) 
	 {this.codigo = codigo;}
	 
	 public String getNombre() 
	 {return nombre;}			
	 public void setNombre(String name) 
	 {this.nombre = name;}
	 
	 
	 public String getCorreo() 
	 {return correo;}			
	 public void setCorreo(String correo) 
	 {this.correo = correo;}
	 
	 public String getContraseña() 
	 {return contraseña;}			
	 public void setContraseñ(String contraseña) 
	 {this.contraseña = contraseña;}
	 
	 public String getTelefono() 
	 {return telefono;}			
	 public void setTelefono(String telefono) 
	 {this.telefono = telefono;}
	 
	 public String getNivel() 
	 {return nivel;}			
	 public void setDireccion(String nivel) 
	 {this.nivel = nivel;}
	 
	 public String getEstado() 
	 {return estado;}			
	 public void setIdEstado(String estado) 
	 {this.estado = estado;}
}

