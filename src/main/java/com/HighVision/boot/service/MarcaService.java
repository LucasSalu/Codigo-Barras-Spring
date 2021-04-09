package com.HighVision.boot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.HighVision.boot.domain.Marca;
import com.HighVision.boot.repositories.MarcaRepository;

@Service
public class MarcaService {
	
	@Autowired
	MarcaRepository marcaRepository;
	
	public Marca findbyId(Long id) {
		Optional<Marca> obj = marcaRepository.findById(id);
		return obj.get();
	}
	
	

}
