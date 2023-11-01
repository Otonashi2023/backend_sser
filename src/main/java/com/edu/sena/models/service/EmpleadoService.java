package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.Empleado;

public interface EmpleadoService {

	public Optional<Empleado>findById(Integer id);
	public List<Empleado> findAll();
	public Empleado save(Empleado e);
	public void deleteById(Integer id);
}
