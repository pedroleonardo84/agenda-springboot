package br.com.digitalhouse.agenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import br.com.digitalhouse.agenda.enumeration.TipoTelefone;

@Entity
public class Telefone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private TipoTelefone tipo;
	private Integer ddd;
	private Integer numero;
	@ManyToOne
	@JoinColumn(name = "agenda_id", nullable = false )
	private Agenda agenda;
	
	public Telefone(TipoTelefone tipo, Integer ddd, Integer numero) {
		this.tipo = tipo;
		this.ddd = ddd;
		this.numero = numero;
	}
	
	public Telefone() {}

	public Integer getId() {
		return id;
	}

	public TipoTelefone getTipo() {
		return tipo;
	}

	public Integer getDdd() {
		return ddd;
	}

	public Integer getNumero() {
		return numero;
	}
	
		
}
