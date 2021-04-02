package com.projras.devras.dto;

import java.io.Serializable;

import com.projras.devras.entities.Cadastro;
import com.projras.devras.entities.enums.Cargo;
import com.projras.devras.entities.enums.TipoCadastro;

public class CadastroDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Long entidadeAssociada;
	private String identificacao; 
	private String nome;
	private String telefoneFixo;
	private String telefoneCelular;
	private String foto;
	private Cargo cargo;
	private TipoCadastro tipoCadastro;
	
	public CadastroDTO() {		
	}

	public CadastroDTO(Cadastro entity) {
		id = entity.getId();
		entidadeAssociada = entity.getEntidadeAssociada();
		identificacao = entity.getIdentificacao();
		nome = entity.getNome();
		telefoneFixo = entity.getTelefoneFixo();
		telefoneCelular = entity.getTelefoneCelular();
		foto = entity.getFoto();
		cargo = entity.getCargo();
		tipoCadastro = entity.getTipoCadastro();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getEntidadeAssociada() {
		return entidadeAssociada;
	}

	public void setEntidadeAssociada(Long entidadeAssociada) {
		this.entidadeAssociada = entidadeAssociada;
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

	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public TipoCadastro getTipoCadastro() {
		return tipoCadastro;
	}

	public void setTipoCadastro(TipoCadastro tipoCadastro) {
		this.tipoCadastro = tipoCadastro;
	}
	
	
	
}
