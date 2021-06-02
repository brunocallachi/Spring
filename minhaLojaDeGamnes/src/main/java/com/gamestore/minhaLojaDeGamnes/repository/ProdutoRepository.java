package com.gamestore.minhaLojaDeGamnes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gamestore.minhaLojaDeGamnes.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	public List<Produto> findAllByPrecoContainingIgnoreCase (long preco);
	
}
 