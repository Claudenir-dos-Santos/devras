package com.projras.devras.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projras.devras.dto.EnderecoDTO;
import com.projras.devras.entities.Endereco;
import com.projras.devras.repositories.EnderecoRepository;

@Service
public class EnderecoService {
	
	@Autowired
	private EnderecoRepository repository;
	
	@Transactional(readOnly = true)
	public List<EnderecoDTO> findAll(){
		List<Endereco> list = repository.findAll();
		return list.stream().map(x -> new EnderecoDTO(x)).collect(Collectors.toList());
	}

}
