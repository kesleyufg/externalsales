package br.ufg.inf.bsi.externalsales.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Contato implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
		
	private String nome;
	private String email;
	private String telefone;
	
	@JsonManagedReference
	@ManyToMany(mappedBy="contatos")
	private List<Cliente> clientes = new ArrayList<Cliente>();
	
	
	public Contato() {
	}
	
	public Contato(Integer id, String nome, String email, String telefone) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public List<Cliente> getContatos() {
		return clientes;
	}

	public void setContatos(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, email, telefone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contato other = (Contato) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(email, other.email) && Objects.equals(telefone, other.telefone);
	}	
}
