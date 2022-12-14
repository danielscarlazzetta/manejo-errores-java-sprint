package com.sprint.error.app.service;

import java.util.List;
import java.util.Optional;

import com.sprint.error.app.models.Usuario;

public interface UsuarioService {

	public List<Usuario> listar();	
	
	public Usuario obtenerPorId(Integer id);
	
	public Optional<Usuario>  obtenerPorIdOptional(Integer id);
	
}
