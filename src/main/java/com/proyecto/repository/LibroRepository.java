package com.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.proyecto.entity.Libro;


public interface LibroRepository extends JpaRepository<Libro, Integer> {
	
	@Query("select x from Libro x where x.codigo = :var_filtro")
	public List<Libro> listaPorCodigo(@Param("var_filtro") String filtro);

	
}