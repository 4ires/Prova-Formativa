package com.projetoform.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoform.entities.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
