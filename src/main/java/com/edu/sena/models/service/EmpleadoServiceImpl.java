package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Empleado;
import com.edu.sena.repository.EmpleadoRepository;

@Service
public class EmpleadoServiceImpl implements EmpleadoService{

	@Autowired
	EmpleadoRepository empleadoRepository;
	
	@Override
	public Optional<Empleado> findById(Integer id) {
		
		return empleadoRepository.findById(id);
	}

	@Override
	public List<Empleado> findAll() {
		
		return empleadoRepository.findAll();
	}

	@Override
	public Empleado save(Empleado e) {
		
		return empleadoRepository.save(e);
	}

	@Override
	public void deleteById(Integer id) {
		
		empleadoRepository.deleteById(id);
	}

}
