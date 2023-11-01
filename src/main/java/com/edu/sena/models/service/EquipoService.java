package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.Equipo;

public interface EquipoService {

	public Optional<Equipo>findById(Long id);
	public List<Equipo> findAll();
	public Equipo save(Equipo e);
	public void deleteById(Long id);
}
