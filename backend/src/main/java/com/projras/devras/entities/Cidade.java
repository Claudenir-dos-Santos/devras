package com.projras.devras.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cidade implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long idCidade;
	private String uf;
	
	List<Endereco> enderecos = new ArrayList<>();
	
	public Cidade() {
	}

	public Cidade(Long idCidade, String uf) {
		super();
		this.idCidade = idCidade;
		this.uf = uf;
	}

	public Long getIdCidade() {
		return idCidade;
	}

	public void setIdCidade(Long idCidade) {
		this.idCidade = idCidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCidade == null) ? 0 : idCidade.hashCode());
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
		Cidade other = (Cidade) obj;
		if (idCidade == null) {
			if (other.idCidade != null)
				return false;
		} else if (!idCidade.equals(other.idCidade))
			return false;
		return true;
	}
}
