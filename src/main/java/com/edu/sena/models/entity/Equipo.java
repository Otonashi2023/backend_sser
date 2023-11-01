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
@Table(name="equipo")
public class Equipo {
	@Id
	@Column(name = "id_equi", nullable = false)
	private long codigo;
	
	@Column(name = "tipo_equip", length = 45, nullable = false)
	private String tipo;
	
	@Column(name = "marc_equip", length = 45, nullable = false)
	private String marca;
	
	@Column(name = "mode_equip", length = 45, nullable = false)
	private String modelo;
	
	@Column(name = "seri_equip", nullable = false)
	private long serial;
	
	@OneToMany
	@JoinColumn(name = "equipo")
	private List<OrdenR> ordenR = new ArrayList<>();
	
	public Equipo() {
		
	}
	
	public Equipo(long codigo) {
		super();
		this.codigo = codigo;
	}

	public Equipo(String tipo, String marca, String modelo, long serial, List<OrdenR> ordenR) {
		super();
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.serial = serial;
		this.ordenR = ordenR;
	}

	public Equipo(long codigo, String tipo, String marca, String modelo, long serial) {
		
		this.codigo = codigo;
		this.tipo = tipo;
		this.marca = marca;
		this.modelo = modelo;
		this.serial = serial;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long equipo) {
		this.codigo = equipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public long getSerial() {
		return serial;
	}

	public void setSerial(long serial) {
		this.serial = serial;
	}

	@Override
	public String toString() {
		return "Equipo [codigo=" + codigo+ ", tipo=" + tipo + ", marca=" + marca + ", modelo=" + modelo + ", serial="
				+ serial + "]";
	}
}
