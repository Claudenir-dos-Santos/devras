package com.projras.devras.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Endereco implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long idEndereco;
	private String logradouro;
	private Long numero;
	private String cep;
	private String gps;
	
	private Cidade cidade;
	
	private List<Cadastro> cadastros = new ArrayList<>();
	
	public Endereco() {
	}

	public Endereco(Long idEndereco, String logradouro, Long numero, String cep, String gps, Cidade cidade) {
		super();
		this.idEndereco = idEndereco;
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.gps = gps;
		this.cidade = cidade;
	}

	public Long getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(Long idEndereco) {
		this.idEndereco = idEndereco;
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

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
	
	public List<Cadastro> getCadastros() {
		return cadastros;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idEndereco == null) ? 0 : idEndereco.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Endereco other = (Endereco) obj;
		if (idEndereco == null) {
			if (other.idEndereco != null)
				return false;
		} else if (!idEndereco.equals(other.idEndereco))
			return false;
		return true;
	}
	
	
	
	

}
