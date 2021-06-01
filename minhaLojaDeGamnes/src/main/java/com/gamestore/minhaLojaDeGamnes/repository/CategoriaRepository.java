package com.gamestore.minhaLojaDeGamnes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamestore.minhaLojaDeGamnes.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	public List<Categoria> findAllByGeneroContainingIgnoreCase (String	genero);


}
