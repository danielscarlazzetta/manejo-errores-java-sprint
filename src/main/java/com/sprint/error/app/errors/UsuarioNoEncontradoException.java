package com.sprint.error.app.errors;

public class UsuarioNoEncontradoException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public UsuarioNoEncontradoException(String id) {
		super("Usuario con ID: ".concat(id).concat(" No existe en el sistema"));
	}

	
	
}
