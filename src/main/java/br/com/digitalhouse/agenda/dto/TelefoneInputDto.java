package br.com.digitalhouse.agenda.dto;

import br.com.digitalhouse.agenda.enumeration.TipoTelefone;
import br.com.digitalhouse.agenda.model.Telefone;

public class TelefoneInputDto {
	
	private TipoTelefone tipo;
	private Integer ddd;
	private Integer numero;
	
	public TelefoneInputDto(TipoTelefone tipo, Integer ddd, Integer numero) {
		this.tipo = tipo;
		this.ddd = ddd;
		this.numero = numero;
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
	
	public Telefone converte() {
		return new Telefone(tipo, ddd, numero);
	}

}
