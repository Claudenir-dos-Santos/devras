package com.projras.devras.dto;

import java.io.Serializable;

import com.projras.devras.entities.Cidade;

public class CidadeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private String uf;
	
	public CidadeDTO() {
		
	}
	
	public CidadeDTO(Cidade entity) {
		id = entity.getId();
		nome = entity.getNome();
		uf = entity.getUf();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}
	
}
