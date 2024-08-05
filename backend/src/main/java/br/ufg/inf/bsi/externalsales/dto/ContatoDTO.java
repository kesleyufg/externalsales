package br.ufg.inf.bsi.externalsales.dto;

import java.io.Serializable;

import br.ufg.inf.bsi.externalsales.domain.Contato;

public class ContatoDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer ID;
	private String nome;
	
	public ContatoDTO() {
		super();
	}
	
	public ContatoDTO(Contato obj) {
		this.ID = obj.getId();
		this.nome = obj.getNome();
	}
	
	public Integer getID() {
		return ID;
	}
	public void setID(Integer iD) {
		ID = iD;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
