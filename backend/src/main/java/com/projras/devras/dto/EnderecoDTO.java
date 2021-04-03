package com.projras.devras.dto;

import java.io.Serializable;

import com.projras.devras.entities.Endereco;

public class EnderecoDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String logradouro;
	private Long numero;
	private String cep;
	
	public EnderecoDTO() {
		
	}

	public EnderecoDTO(Endereco entity) {
		id = entity.getId();
		logradouro = entity.getLogradouro();
		numero = entity.getNumero();
		cep = entity.getCep();
	}
		
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
	
}
