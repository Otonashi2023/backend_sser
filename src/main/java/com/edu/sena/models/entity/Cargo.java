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
@Table(name = "cargo")
public class Cargo {
	@Id
	@Column(name = "id_cargo", nullable = false)
	private int codigo;

	@Column(name = "nom_cargo", length = 20, nullable = false)
	private String nombre;

	@OneToMany
	@JoinColumn(name = "cargo")
	private List<Empleado> empleado = new ArrayList<>();

	public Cargo() {
	
	}

	public Cargo(int codigo) {
		
		this.codigo = codigo;
	}

	public Cargo(String nombre, List<Empleado> empleado) {
		
		this.nombre = nombre;
		this.empleado = empleado;
	}

	public Cargo(int codigo, String nombre, List<Empleado> empleado) {
		
		this.codigo = codigo;
		this.nombre = nombre;
		this.empleado = empleado;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Cargo [codigo=" + codigo + ", nombre=" + nombre + ", empleado=" + empleado + "]";
	}
}
