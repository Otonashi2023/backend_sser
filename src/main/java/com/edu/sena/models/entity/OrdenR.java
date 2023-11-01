package com.edu.sena.models.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "orden_reparacion")
public class OrdenR {

	@Id
	@Column(name = "id_orden", nullable = false)
	private long codigo;
	
	@Column(name = "est_orden", length = 45, nullable = false)
	private String estado;
	
	@Column(name = "serv_orden", length = 45, nullable = false)
	private String servicio;
	
	@Column(name = "obs_orden", length = 255, nullable = false)
	private String observacion;
		
	@ManyToOne
	@JoinColumn(name = "cliente", nullable = false)
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "equipo", nullable = false)
	private Equipo equipo;
	
	@ManyToOne
	@JoinColumn(name = "empleado", nullable = false)
	private Empleado empleado;

	public OrdenR() {
		
	}
	
	public OrdenR(long codigo) {
		
		this.codigo = codigo;
	}

	public OrdenR(String estado, String servicio, String observacion, Cliente cliente, Equipo equipo,
			Empleado empleado) {
		
		this.estado = estado;
		this.servicio = servicio;
		this.observacion = observacion;
		this.cliente = cliente;
		this.equipo = equipo;
		this.empleado = empleado;
	}

	public OrdenR(long codigo, String estado, String servicio,
			String observacion, Cliente cliente, Equipo equipo, Empleado empleado) {
		
		this.codigo = codigo;
		this.estado = estado;
		this.servicio = servicio;
		this.observacion = observacion;
		this.cliente = cliente;
		this.equipo = equipo;
		this.empleado = empleado;
	}

	public long getCodigo() {
		return codigo;
	}

	public void setCodigo(long codigo) {
		this.codigo = codigo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getServicio() {
		return servicio;
	}

	public void setServicio(String servicio) {
		this.servicio = servicio;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}

	@Override
	public String toString() {
		return "OrdenR [codigo=" + codigo + ", estado=" + estado + ", servicio=" + servicio
				+ ", observacion=" + observacion + ", cliente=" + cliente + ", equipo=" + equipo + ", empleado="
				+ empleado + "]";
	}
}
