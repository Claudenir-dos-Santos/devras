package com.projras.devras.dto;

import java.io.Serializable;

import com.projras.devras.entities.enums.Cargo;
import com.projras.devras.entities.enums.TipoCadastro;

public class CadastroInsertDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long cargoId;
	private Long tipoCadastroId;
	private Long entidadeAssociada;
	private Long enderecoId;
	private String identificacao; 
	private String nome;
	private String telefoneFixo;
	private String telefoneCelular;
	private String foto;
	
	public CadastroInsertDTO() {
	}

	public Long getCargoId() {
		return cargoId;
	}

	public void setCargoId(Long cargoId) {
		this.cargoId = cargoId;
	}

	public Long getTipoCadastroId() {
		return tipoCadastroId;
	}

	public void setTipoCadastroId(Long tipoCadastroId) {
		this.tipoCadastroId = tipoCadastroId;
	}

	public Long getEntidadeAssociada() {
		return entidadeAssociada;
	}

	public void setEntidadeAssociada(Long entidadeAssociada) {
		this.entidadeAssociada = entidadeAssociada;
	}

	
	
	public Long getEnderecoId() {
		return enderecoId;
	}

	public void setEnderecoId(Long enderecoId) {
		this.enderecoId = enderecoId;
	}

	public String getIdentificacao() {
		return identificacao;
	}

	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefoneFixo() {
		return telefoneFixo;
	}

	public void setTelefoneFixo(String telefoneFixo) {
		this.telefoneFixo = telefoneFixo;
	}

	public String getTelefoneCelular() {
		return telefoneCelular;
	}

	public void setTelefoneCelular(String telefoneCelular) {
		this.telefoneCelular = telefoneCelular;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
	
	
}
