package com.projras.devras.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projras.devras.dto.CadastroDTO;
import com.projras.devras.entities.Cadastro;
import com.projras.devras.repositories.CadastroRepository;

@Service
public class CadastroService {
	
	@Autowired
	private CadastroRepository repository;
	
	@Transactional(readOnly = true)
	public List<CadastroDTO> findAll(){
		List<Cadastro> list = repository.findAll();
		return list.stream().map(x -> new CadastroDTO(x)).collect(Collectors.toList());
	}

}
