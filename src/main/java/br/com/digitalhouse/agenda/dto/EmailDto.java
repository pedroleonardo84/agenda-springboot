package br.com.digitalhouse.agenda.dto;

import br.com.digitalhouse.agenda.enumeration.TipoEmail;
import br.com.digitalhouse.agenda.model.Email;

public class EmailDto {

	private TipoEmail tipo;
	private String email;
	
	public EmailDto(TipoEmail tipo, String email) {
		this.tipo = tipo;
		this.email = email;
	}


	public TipoEmail getTipo() {
		return tipo;
	}

	public String getEmail() {
		return email;
	}
	
	public Email converte() {
		return new Email(tipo,email);
	}
	
	
}
