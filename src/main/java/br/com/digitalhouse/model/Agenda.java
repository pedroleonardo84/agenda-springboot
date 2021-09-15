package br.com.digitalhouse.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Agenda {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nome;
	private String sobrenome;
	private LocalDate dataNascimento;
	
	@OneToMany(mappedBy = "agenda", cascade = CascadeType.ALL)
	private List<Telefone> listatelefones = new ArrayList<>();
	@OneToMany(mappedBy = "agenda", cascade = CascadeType.ALL)
	private List<Email> emails = new ArrayList<>();
	@OneToMany(mappedBy = "agenda", cascade = CascadeType.ALL)
	private List<Endereco> enderecos = new ArrayList<>();
	
	
	public Agenda(String nome, String sobrenome, LocalDate dataNascimento, List<Telefone> listatelefones,
			List<Email> emails, List<Endereco> enderecos) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.listatelefones = listatelefones;
		this.emails = emails;
		this.enderecos = enderecos;
	}
	
	public Agenda() {}

	public Integer getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public List<Telefone> getListatelefones() {
		return listatelefones;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}
	
	
}
