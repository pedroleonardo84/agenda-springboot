package br.com.digitalhouse.agenda.dto;

import br.com.digitalhouse.agenda.model.Endereco;

public class EnderecoInputDto {

	private String logradouro;
	private Integer numero;
	private String cep;
	private String cidade;
	private String estado;
	
	
	public EnderecoInputDto(String logradouro, Integer numero, String cep, String cidade, String estado) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}


	public String getLogradouro() {
		return logradouro;
	}


	public Integer getNumero() {
		return numero;
	}


	public String getCep() {
		return cep;
	}


	public String getCidade() {
		return cidade;
	}


	public String getEstado() {
		return estado;
	}
	
	public Endereco converte() {
		return new Endereco(logradouro, numero, cep, cidade, estado);
	}
	
}
