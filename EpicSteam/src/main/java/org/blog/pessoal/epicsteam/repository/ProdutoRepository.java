package org.blog.pessoal.epicsteam.repository;

import java.util.List;
import org.blog.pessoal.epicsteam.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //COMUNICACAO COM O BANCO DE DADOS
public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase (String nome);
	
}