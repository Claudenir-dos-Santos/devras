package com.projras.devras.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projras.devras.dto.CidadeDTO;
import com.projras.devras.entities.Cidade;
import com.projras.devras.repositories.CidadeRepository;

@Service
public class CidadeService {

	@Autowired
	private CidadeRepository repository;
	
	@Transactional(readOnly = true)
	public List<CidadeDTO> findAll() {
		List<Cidade> list = repository.findAll();
		return list.stream().map(x -> new CidadeDTO(x)).collect(Collectors.toList());
	}
	
	
}
