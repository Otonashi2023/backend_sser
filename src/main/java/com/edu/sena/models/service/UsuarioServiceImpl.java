package com.edu.sena.models.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.sena.models.entity.Usuario;
import com.edu.sena.repository.UsuarioRepository;

//Aqui se describe la funcionalidad de los metodos
@Service
public class UsuarioServiceImpl implements UsuarioService{

	//esto es para inyectar la dependencia
	@Autowired
	UsuarioRepository usuarioRepository;
	
	@Override
	public Usuario save(Usuario u) { // se guarda el registro
		
		return usuarioRepository.save(u);
	}

	@Override
	public String login(String user, String ctr) {//aqui se autentifica al logear
		
		Usuario usuario = usuarioRepository.findByUsername(user);
		
		if(usuario == null) {
			return "usuario no encontrado";
		}
		
		if(!usuario.getPassword().equals(ctr)) {
			return "contraseña incorrecta";
		}
		
		return "inicio de sesion exitoso";
	}

	@Override
	public Optional<Usuario> findById(Long id) {
		
		return usuarioRepository.findById(id);
	}

	@Override
	public List<Usuario> findAll() {
		
		return usuarioRepository.findAll();
	}

	@Override
	public void deleteById(Long id) {
		
		usuarioRepository.deleteById(id);
	}
}
