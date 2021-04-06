package com.projras.devras.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projras.devras.dto.CidadeDTO;
import com.projras.devras.dto.CidadeInsertDTO;
import com.projras.devras.entities.Cidade;
import com.projras.devras.repositories.CidadeRepository;

@Service
public class CidadePostService {

	@Autowired
	private CidadeRepository repository;
	
	@Transactional
	public CidadeDTO insert(CidadeInsertDTO dto) {
	
		Cidade entity = new Cidade();
		
		entity.setNome(dto.getNome());
		entity.setUf(dto.getUf());
		
		entity = repository.save(entity);
		
		return CidadeDTO(entity);
	}

	private CidadeDTO CidadeDTO(Cidade entity) {
		// TODO Auto-generated method stub
		return null;
	}
		
}
