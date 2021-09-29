package br.com.digitalhouse.agenda.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.digitalhouse.agenda.enumeration.TipoEmail;

@Entity
public class Email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	private TipoEmail tipo;
	private String email;
	@ManyToOne
	@JoinColumn(name = "agenda_id", nullable = false)
	private Agenda agenda;
	
	public Email(TipoEmail tipo, String email) {
		this.tipo = tipo;
		this.email = email;
	}
	
	public Email() {}

	public Integer getId() {
		return id;
	}

	public TipoEmail getTipo() {
		return tipo;
	}

	public String getEmail() {
		return email;
	}
	
	
}
