package br.com.digitalhouse.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import br.com.digitalhouse.enumeration.TipoTelefone;

@Entity
public class Telefone {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private TipoTelefone tipo;
	private Integer ddd;
	private Integer numero;
	
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
