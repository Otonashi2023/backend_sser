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

import com.edu.sena.models.entity.Cliente;
import com.edu.sena.models.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin(origins= "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class ClienteController {

	@Autowired
	ClienteService clienteService;
	
	@GetMapping("/{id}")
	public Optional<Cliente> buscarPorId(@PathVariable Long id) {
		
		return clienteService.findById(id);		
	}
	
	@GetMapping("/listar")
	public List<Cliente> listarTodos(){
		
		return clienteService.findAll();
	}
	
	@PostMapping
	public Cliente guardar(@RequestBody Cliente c) {
		
		return clienteService.save(c);
	}
	
	@DeleteMapping("/{id}")
	public void eliminar(@PathVariable Long id) {
		
		clienteService.deleteById(id);
	}
	
	@PutMapping("/actualizar/{id}")
	public Cliente actualizar(@RequestBody Cliente c, @PathVariable Long id) {
		
		Cliente cEnBD = clienteService.findById(id).get();
		
		cEnBD.setNombre(c.getNombre());
		cEnBD.setApellido(c.getApellido());
		cEnBD.setCedula(c.getCedula());
		cEnBD.setTelefono(c.getTelefono());
		cEnBD.setDireccion(c.getDireccion());
		cEnBD.setCorreo(c.getCorreo());
		
		return clienteService.save(cEnBD);
		
	}
}
