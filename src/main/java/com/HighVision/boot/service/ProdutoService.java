package com.HighVision.boot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HighVision.boot.domain.Produto;
import com.HighVision.boot.repositories.ProdutoRepository;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	public Produto findById(Long id) {
		Optional<Produto> obj =  produtoRepository.findById(id);
		return obj.get();
	}

}
