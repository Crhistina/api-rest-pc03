package com.proyecto.service;

import java.util.List;

import com.proyecto.entity.Libro;

public interface LibroService {
	
	public List<Libro> listaLibro();
	public List<Libro> listaLibroPorCodigo(String codigo);

}
