package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.OrdenR;
import com.edu.sena.repository.OrdenRepository;

@Service
public class OrdenServiceImpl implements OrdenService{

	@Autowired
	OrdenRepository ordenRepository;
	
	@Override
	public Optional<OrdenR> findById(Long id) {
		
		return ordenRepository.findById(id);
	}

	@Override
	public List<OrdenR> findAll() {
		
		return ordenRepository.findAll();
	}

	@Override
	public OrdenR save(OrdenR o) {
		
		return ordenRepository.save(o);
	}

	@Override
	public void deleteById(Long id) {
		
		ordenRepository.deleteById(id);
	}

}
