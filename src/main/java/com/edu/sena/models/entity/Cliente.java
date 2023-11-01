package com.edu.sena.models.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "cliente")
public class Cliente {

	@Id
	@Column(name = "id_client", nullable = false)
	private long codigo;
	
	@Column(name = "nom_client",length = 45, nullable = false)
	private String nombre;
	
	@Column(name = "ape_client", length = 45, nullable = false)
	private String apellido;
	
	@Column(name = "ced_client", nullable = false)
	private  long cedula;
	
	@Column(name = "tel_client", nullable = false)
	private long telefono;
	
	@Column(name = "dir_client", length = 45, nullable = false)
	private String direccion;
	
	@Column(name = "corr_client", length = 45, nullable = false)
	private String correo;
	
	@OneToMany
	@JoinColumn(name = "cliente")
	private List<OrdenR> ordenR = new ArrayList<>();
	
	public Cliente() {
		
	}
	
	public Cliente(long codigo) {
		
		this.codigo = codigo;
	}

	public Cliente(String nombre, String apellido, long cedula, Long telefono, String direccion, String correo,
			Usuario usuario, List<OrdenR> ordenR) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.ordenR = ordenR;
	}

	public Cliente(long codigo, String nombre, String apellido, long cedula, long telefono,
			String direccion, String correo,Usuario usuario, List<OrdenR> ordenR) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.ordenR = ordenR;
	}
	
	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getCedula() {
		return cedula;
	}

	public void setCedula(long cedula) {
		this.cedula = cedula;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	@Override
	public String toString() {
		return "Cliente [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + ", ordenR=" + ordenR + "]";
	}
}
