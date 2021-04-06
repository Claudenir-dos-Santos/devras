package com.projras.devras.dto;

import java.io.Serializable;

import com.projras.devras.entities.Cidade;

public class CidadeInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String nome;
	private String uf;
	
	public CidadeInsertDTO() {
		
	}
	
	public CidadeInsertDTO(Cidade entity) {
		nome = entity.getNome();
		uf = entity.getUf();
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
