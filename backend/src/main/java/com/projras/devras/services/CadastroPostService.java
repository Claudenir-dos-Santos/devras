package com.projras.devras.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.projras.devras.dto.CadastroInsertPostDTO;
import com.projras.devras.dto.CadastroPostDTO;
import com.projras.devras.entities.Cadastro;
import com.projras.devras.entities.Endereco;
import com.projras.devras.entities.enums.Cargo;
import com.projras.devras.entities.enums.TipoCadastro;
import com.projras.devras.repositories.CadastroRepository;
import com.projras.devras.repositories.EnderecoRepository;

@Service
public class CadastroPostService {

	public Cargo cargo;
	public TipoCadastro tipoCadastro;
	
	@Autowired
	private CadastroRepository repository;
		
	@Autowired
	private EnderecoRepository numEndereco;
	
	@Transactional
	public CadastroPostDTO insert(CadastroInsertPostDTO dto) {
	
		Cadastro entity = new Cadastro();
		
		entity.setCargo(dto.getCargo());
		entity.setTipoCadastro(dto.getTipoCadastro());		
		entity.setEntidadeAssociada(dto.getEntidadeAssociada());
		Endereco num = numEndereco.getOne(dto.getEnderecoId());
		entity.setEndereco(num);
		entity.setIdentificacao(dto.getIdentificacao());
		entity.setNome(dto.getNome());
		entity.setTelefoneFixo(dto.getTelefoneFixo());
		entity.setTelefoneCelular(dto.getTelefoneCelular());
		entity.setFoto(dto.getFoto());
	
		entity = repository.save(entity);
		return new CadastroPostDTO(entity);
	}
		
}
