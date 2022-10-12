package com.sprint.error.app.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.sprint.error.app.models.Usuario;

@Service
public class UsuarioServiceImpl implements UsuarioService{

	private List<Usuario> lista;
	
	
	
	public UsuarioServiceImpl() {
		this.lista = new ArrayList<>();
		this.lista.add(new Usuario(1, "a", "aa"));
		this.lista.add(new Usuario(2, "b", "bb"));
		this.lista.add(new Usuario(3, "c", "cc"));
		this.lista.add(new Usuario(4, "d", "dd"));
		this.lista.add(new Usuario(5, "e", "ee"));
		this.lista.add(new Usuario(6, "f", "ff"));
		this.lista.add(new Usuario(7, "g", "gg"));
		this.lista.add(new Usuario(8, "h", "hh"));
		
	}

	@Override
	public List<Usuario> listar(){ return this.lista;}
	
	@Override
	public Usuario obtenerPorId(Integer id) { 
		Usuario resultado = null;
		
		for(Usuario u: this.lista) {
			if(u.getId().equals(id)) {
				resultado = u;
				break;
			}
		}
		
		return resultado;
		
	}

	@Override
	public Optional<Usuario> obtenerPorIdOptional(Integer id) {
		Usuario usuario = obtenerPorId(id);
		return Optional.ofNullable(usuario);
	}
}
