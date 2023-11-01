package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import com.edu.sena.models.entity.OrdenR;

public interface OrdenService {

	public Optional<OrdenR>findById(Long id);
	public List<OrdenR> findAll();
	public OrdenR save(OrdenR o);
	public void deleteById(Long id);
}
