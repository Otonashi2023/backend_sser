/*package com.edu.sena.controller;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.edu.sena.models.entity.Cliente;
import com.edu.sena.models.service.ClienteService;

@ExtendWith(MockitoExtension.class)
public class ClienteControllerTest {
	
	@InjectMocks
	private ClienteController clienteController;
	
	@Mock
	private ClienteService clienteService;
	
	@Test
	public void  pruebaBuscarById() {
		
		Cliente clienteSimulado = new Cliente();
		
		clienteSimulado.setCodigo(1);
		clienteSimulado.setNombre("Fernando");
		clienteSimulado.setApellido("Ordoñez");
		clienteSimulado.setCedula(12345);
		clienteSimulado.setTelefono(678910);
		clienteSimulado.setDireccion("NA");
		clienteSimulado.setCorreo("k@gmail.com");
		
		when(clienteService.findById((long)1)).thenReturn(Optional.of(clienteSimulado));
		
		Optional<Cliente> resultado = clienteController.buscarPorId((long)1);
		
		assertNotNull(resultado);
		assertTrue(resultado.isPresent());
	}
	
	@Test
	public void pruebaListarTodos() {
		
		Cliente clienteSimulado = new Cliente();
		
		clienteSimulado.setCodigo(1);
		clienteSimulado.setNombre("Fernando");
		clienteSimulado.setApellido("Ordoñez");
		clienteSimulado.setCedula(12345);
		clienteSimulado.setTelefono(678910);
		clienteSimulado.setDireccion("NA");
		clienteSimulado.setCorreo("k@gmail.com");
		
		clienteSimulado.setCodigo(2);
		clienteSimulado.setNombre("Yisela");
		clienteSimulado.setApellido("Hernandez");
		clienteSimulado.setCedula(12345);
		clienteSimulado.setTelefono(678910);
		clienteSimulado.setDireccion("NA");
		clienteSimulado.setCorreo("y@gmail.com");
		
		
		when(clienteService.findAll()).thenReturn(List.of(clienteSimulado));
		
		List<Cliente> resultado= clienteController.listarTodos();
	}
	
	@Test
	public void pruebaGuardar() {
	    Cliente clienteSimulado = new Cliente();
	    
	    clienteSimulado.setCodigo(1);
		clienteSimulado.setNombre("Juan Fernando");
		clienteSimulado.setApellido("Ordoñez Hernandez");
		clienteSimulado.setCedula(12345);
		clienteSimulado.setTelefono(678910);
		clienteSimulado.setDireccion("NA");
		clienteSimulado.setCorreo("k@gmail.com");
	    
	    when(clienteService.save(clienteSimulado)).thenReturn(clienteSimulado);
	    
	    
	    Optional<Cliente> resultado = Optional.of(clienteController.guardar(clienteSimulado));
	    
	    assertNotNull(resultado);
	    
	    assertTrue(resultado.isPresent());
	   
	    assertEquals(clienteSimulado, resultado.get());
	    
	 
	    verify(clienteService, times(1)).save(clienteSimulado);
	    }
	
	@Test
	public void pruebaEliminar() {
	    Cliente clienteSimulado = new Cliente();
	    
	    clienteSimulado.setCodigo(1);
		clienteSimulado.setNombre("Juan Fernando");
		clienteSimulado.setApellido("Ordoñez Hernandez");
		clienteSimulado.setCedula(12345);
		clienteSimulado.setTelefono(678910);
		clienteSimulado.setDireccion("NA");
		clienteSimulado.setCorreo("k@gmail.com");

	    doNothing().when(clienteService).deleteById((long)1);
	    
	    clienteService.deleteById((long)1);

	   
	    Optional<Cliente> resultado = clienteService.findById((long)1);
	    assertThat(resultado.isEmpty()).isTrue();
	   
	}

}
*/