package com.projras.devras.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projras.devras.dto.EnderecoInsertDTO;
import com.projras.devras.dto.EnderecoPostDTO;
import com.projras.devras.entities.Cidade;
import com.projras.devras.entities.Endereco;
import com.projras.devras.repositories.CidadeRepository;
import com.projras.devras.repositories.EnderecoRepository;

@Service
public class EnderecoPostService {

	@Autowired
	private EnderecoRepository repository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Transactional
	public EnderecoPostDTO insert(EnderecoInsertDTO dto) {
	
		Endereco entity = new Endereco();
		
		entity.setLogradouro(dto.getLogradouro());
		entity.setNumero(dto.getNumero());
		entity.setCep(dto.getCep());
		
		Cidade cidade = cidadeRepository.getOne(dto.getCidadeId());
		entity.setCidade(cidade);
		
		entity = repository.save(entity);
		return new EnderecoPostDTO(entity);
	}
		
}
