package br.com.digitalhouse.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.digitalhouse.enumeration.TipoEmail;

@Entity
public class Email {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@Enumerated(EnumType.STRING)
	private TipoEmail tipo;
	private String email;
	
	public Email(TipoEmail tipo, String email) {
		this.tipo = tipo;
		this.email = email;
	}

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
