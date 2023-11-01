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

import com.edu.sena.models.entity.Empleado;
import com.edu.sena.models.service.EmpleadoService;

@RestController
@RequestMapping ("/api/empleado")
@CrossOrigin(origins= "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class EmpleadoController {

	@Autowired
	EmpleadoService empleadoService;
	
	@GetMapping("/{id}")
	public Optional<Empleado> buscarPorId(@PathVariable Integer id) {
		
		return empleadoService.findById(id);		
	}
	
	@GetMapping("/listar")
	public List<Empleado> listarTodos(){
		
		return empleadoService.findAll();
	}
	
	@PostMapping
	public Empleado guardar(@RequestBody Empleado e) {
		
		return empleadoService.save(e);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Integer id) {
		
		empleadoService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Empleado actualizar(@RequestBody Empleado e, @PathVariable Integer id) {
		
		Empleado eEnBD = empleadoService.findById(id).get();
		
		eEnBD.setNombre(e.getNombre());
		eEnBD.setApellido(e.getApellido());
		eEnBD.setCedula(e.getCedula());
		eEnBD.setTelefono(e.getTelefono());
		eEnBD.setDireccion(e.getDireccion());
		eEnBD.setCorreo(e.getCorreo());
		eEnBD.setSalario(e.getSalario());
		eEnBD.setCargo(e.getCargo());
		eEnBD.setUsuario(e.getUsuario());
		
		return empleadoService.save(eEnBD);
		
	}
}
