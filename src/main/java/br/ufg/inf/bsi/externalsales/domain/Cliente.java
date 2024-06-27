package br.ufg.inf.bsi.externalsales.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Cliente implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String cnpj;
	private String ie;
	private String razaoSocial;
	
	@ManyToMany
    @JoinTable(name="CLIENTE_CONTATO",
    joinColumns = @JoinColumn(name = "cliente_id"),
    inverseJoinColumns = @JoinColumn(name = "contato_id"))
	private List<Contato> contatos = new ArrayList<Contato>();
	
	public Cliente() {
	}
	
	public Cliente(Integer id, String cnpj, String ie, String razaoSocial) {
		super();
		this.id = id;
		this.ie = ie;
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIe() {
		return ie;
	}

	public void setIe(String ie) {
		this.ie = ie;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public List<Contato> getContatos() {
		return contatos;
	}

	public void setContatos(List<Contato> contatos) {
		this.contatos = contatos;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(id, other.id);
	}

}
