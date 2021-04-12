package com.projras.devras.dto;

import java.io.Serializable;

import com.projras.devras.entities.Endereco;

public class EnderecoPostDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String logradouro;
	private Long numero;
	private String cep;
	private Long cidadeId;
	
	public EnderecoPostDTO() {
		
	}

	public EnderecoPostDTO(Endereco entity) {
		
		logradouro = entity.getLogradouro();
		numero = entity.getNumero();
		cep = entity.getCep();
		cidadeId = entity.getCidade().getId();
	}
		
	

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public Long getNumero() {
		return numero;
	}

	public void setNumero(Long numero) {
		this.numero = numero;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Long getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(Long cidadeId) {
		this.cidadeId = cidadeId;
	}
	
	
}
