package br.com.digitalhouse.agenda.dto;

public class LoginDto {
	
	private String email;
	private String senha;
	
	public LoginDto(String email, String senha) {
		this.email = email;
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public String getSenha() {
		return senha;
	}
	
}