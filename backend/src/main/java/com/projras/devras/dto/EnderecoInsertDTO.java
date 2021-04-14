package com.projras.devras.dto;

import java.io.Serializable;

import com.projras.devras.entities.Endereco;

public class EnderecoInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String logradouro;
	private Long numero;
	private String cep;
	private String gps;
	private Long cidadeId;
	
	public EnderecoInsertDTO() {
		
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

	public String getGps() {
		return gps;
	}

	public void setGps(String gps) {
		this.gps = gps;
	}

	public Long getCidadeId() {
		return cidadeId;
	}

	public void setCidadeId(Long cidadeId) {
		this.cidadeId = cidadeId;
	}
	
}
