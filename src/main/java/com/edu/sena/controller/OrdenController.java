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

import com.edu.sena.models.entity.OrdenR;
import com.edu.sena.models.service.OrdenService;

@RestController
@RequestMapping("/api/ordenr")
@CrossOrigin(origins= "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class OrdenController {

	@Autowired
	OrdenService ordenService;
	
	@GetMapping("/{id}")
	public Optional<OrdenR> buscarPorId(@PathVariable Long id) {
		
		return ordenService.findById(id);		
	}
	
	@GetMapping("/listar")
	public List<OrdenR> listarTodos(){
		
		return ordenService.findAll();
	}
	
	@PostMapping
	public OrdenR guardar(@RequestBody OrdenR o) {
		
		return ordenService.save(o);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id) {
		
		ordenService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public OrdenR actualizar(@RequestBody OrdenR o, @PathVariable Long id) {
		
		OrdenR oEnBD = ordenService.findById(id).get();
		
		oEnBD.setEstado(o.getEstado());
		oEnBD.setServicio(o.getServicio());
		oEnBD.setObservacion(o.getObservacion());
		oEnBD.setCliente(o.getCliente());
		oEnBD.setEquipo(o.getEquipo());
		oEnBD.setEmpleado(o.getEmpleado());
		
		
		return ordenService.save(oEnBD);

	}
}
