package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Equipo;
import com.edu.sena.repository.EquipoRepository;

@Service
public class EquipoServiceImpl implements EquipoService{

	@Autowired
	EquipoRepository equipoRepository;
	
	@Override
	public Optional<Equipo> findById(Long id) {
		
		return equipoRepository.findById(id);
	}

	@Override
	public List<Equipo> findAll() {
		
		return equipoRepository.findAll();
	}

	@Override
	public Equipo save(Equipo e) {
		
		return equipoRepository.save(e);
	}

	@Override
	public void deleteById(Long id) {
		
		equipoRepository.deleteById(id);
		
	}

}
