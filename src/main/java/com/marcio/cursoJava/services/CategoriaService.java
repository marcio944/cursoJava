package com.marcio.cursoJava.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcio.cursoJava.domain.Categoria;
import com.marcio.cursoJava.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Categoria obj = repo.getOne(id);
		return obj;
		
	}
	
}
