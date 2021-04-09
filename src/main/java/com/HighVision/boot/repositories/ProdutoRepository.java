package com.HighVision.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.HighVision.boot.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
