package com.edu.sena.models.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "empleado")
public class Empleado {
	@Id
	@Column(name = "id_empl", nullable = false)
	private int codigo;

	@Column(name = "nom_empl", length = 45, nullable = false)
	private String nombre;

	@Column(name = "ape_empl", length = 45, nullable = false)
	private String apellido;

	@Column(name = "ced_empl", nullable = false)
	private long cedula;

	@Column(name = "tel_empl", nullable = false)
	private long telefono;

	@Column(name = "dir_empl", length = 45, nullable = false)
	private String direccion;

	@Column(name = "corr_empl", length = 45, nullable = false)
	private String correo;

	@Column(name = "sal_empl", nullable = false)
	private long salario;
	
	@ManyToOne
	@JoinColumn(name = "cargo", nullable = false)
	private Cargo cargo;
	 
	@OneToOne
	@JoinColumn(name = "usuario", nullable= false)
	private Usuario usuario;
	
	@OneToMany
	@JoinColumn(name = "empleado")
	private List<OrdenR> ordenR = new ArrayList<>();

	public Empleado() {
		
	}
	
	public Empleado(int codigo) {
		
		this.codigo = codigo;
	}

	public Empleado(String nombre, String apellido, long cedula, long telefono, String direccion, String correo,
			long salario, Cargo cargo, Usuario usuario) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.salario = salario;
		this.cargo = cargo;
		this.usuario = usuario;
	}
	
	public Empleado(int codigo, String nombre, String apellido, long cedula, long telefono, String direccion,
			String correo, long salario, Cargo cargo, Usuario usuario) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
		this.salario = salario;
		this.cargo = cargo;
		this.usuario = usuario;
	}
	

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
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

	public long getSalario() {
		return salario;
	}

	public void setSalario(long salario) {
		this.salario = salario;
	}

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", nombre=" + nombre + ", apellido=" + apellido + ", cedula=" + cedula
				+ ", telefono=" + telefono + ", direccion=" + direccion + ", correo=" + correo + ", salario=" + salario
				+ ", cargo=" + cargo + ", usuario=" + usuario + "]";
	}
}
