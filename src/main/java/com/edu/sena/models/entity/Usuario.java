package com.edu.sena.models.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity // mapea la entidad
@Table(name="usuario")
public class Usuario {

	@Id													//llave primaria
	@GeneratedValue(strategy = GenerationType.IDENTITY) //autoincrementar
	@Column (name="id_usu", nullable = false)
	private long id;
	
	@Column(name = "nom_usu", nullable = false, length = 45)
	private String username;							
	
	@Column(name = "cont_usu", nullable = false, length = 45)
	private String password;							
	
	@OneToOne(mappedBy = "usuario", cascade = CascadeType.ALL) //relacion 1 a 1
	private Empleado empleado;

	//constructores
	public Usuario() {
	}
	
	public Usuario(long id) {

		this.id = id;
	}

	public Usuario(String username, String password, Empleado empleado) {
		
		this.username = username;
		this.password = password;
		this.empleado = empleado;
	}
		
	public Usuario(long id, String username, String password, Empleado empleado) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.empleado = empleado;
	}

	//Getter and Setter
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
}
