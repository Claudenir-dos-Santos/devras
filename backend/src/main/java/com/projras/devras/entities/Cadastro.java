package com.projras.devras.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.projras.devras.entities.enums.Cargo;
import com.projras.devras.entities.enums.TipoCadastro;

@Entity
@Table(name= "tb_cadastro")
public class Cadastro implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCadastro;
	private Long entidadeAssociada;
	private String identificacao;
	private String nome;
	private String telefoneFixo;
	private String telefoneCelular;
	private Cargo cargo;
	private TipoCadastro tipoCadastro;
	
	@ManyToOne
	@JoinColumn(name = "endereco_idEndereco")
	private Endereco endereco;
	
	public Cadastro() {
	}

	public Cadastro(Long idCadastro, Long entidadeAssociada, String identificacao, String nome, String telefoneFixo,
			String telefoneCelular, Cargo cargo, TipoCadastro tipoCadastro, Endereco endereco) {
		super();
		this.idCadastro = idCadastro;
		this.entidadeAssociada = entidadeAssociada;
		this.identificacao = identificacao;
		this.nome = nome;
		this.telefoneFixo = telefoneFixo;
		this.telefoneCelular = telefoneCelular;
		this.cargo = cargo;
		this.tipoCadastro = tipoCadastro;
		this.endereco = endereco;
	}

	public Long getIdCadastro() {
		return idCadastro;
	}

	public void setIdCadastro(Long idCadastro) {
		this.idCadastro = idCadastro;
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

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idCadastro == null) ? 0 : idCadastro.hashCode());
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
		Cadastro other = (Cadastro) obj;
		if (idCadastro == null) {
			if (other.idCadastro != null)
				return false;
		} else if (!idCadastro.equals(other.idCadastro))
			return false;
		return true;
	}
	

}
