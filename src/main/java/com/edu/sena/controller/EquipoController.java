package com.edu.sena.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.edu.sena.models.entity.Equipo;
import com.edu.sena.models.service.EquipoService;

@RestController
@RequestMapping("/api/equipo")
@CrossOrigin(origins= "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class EquipoController {

	@Autowired
	EquipoService equipoService;
	
	@GetMapping("/{id}")
	public Optional<Equipo> buscarPorId(@PathVariable Long id) {
		
		return equipoService.findById(id);		
	}
	
	@GetMapping("/listar")
	public List<Equipo> listarTodos(){
		
		return equipoService.findAll();
	}
	
	@PostMapping
	public Equipo guardar(@RequestBody Equipo c) {
		
		return equipoService.save(c);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id) {
		
		equipoService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Equipo actualizar(@RequestBody Equipo e, @PathVariable Long id) {
		
		Equipo eEnBD = equipoService.findById(id).get();
		
		eEnBD.setTipo(e.getTipo());
		eEnBD.setMarca(e.getMarca());
		eEnBD.setModelo(e.getModelo());
		eEnBD.setSerial(e.getSerial());
				
		return equipoService.save(eEnBD);
		
	}
}
