package br.com.digitalhouse.dto;

import br.com.digitalhouse.enumeration.TipoEmail;
import br.com.digitalhouse.model.Email;

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
