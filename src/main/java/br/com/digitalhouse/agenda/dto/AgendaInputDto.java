package br.com.digitalhouse.agenda.dto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.digitalhouse.agenda.model.Agenda;
import br.com.digitalhouse.agenda.model.Email;
import br.com.digitalhouse.agenda.model.Endereco;
import br.com.digitalhouse.agenda.model.Telefone;


public class AgendaInputDto {

	private String nome;
	private String sobrenome;
	private LocalDate dataNascimento;
	private List<TelefoneInputDto> listatelefones = new ArrayList<>();
	private List<EmailDto> emails = new ArrayList<>();
	private List<EnderecoInputDto> enderecos = new ArrayList<>();
	
	
	public AgendaInputDto(String nome, String sobrenome, LocalDate dataNascimento,
			List<TelefoneInputDto> listatelefones, List<EmailDto> emails, List<EnderecoInputDto> enderecos) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataNascimento = dataNascimento;
		this.listatelefones = listatelefones;
		this.emails = emails;
		this.enderecos = enderecos;
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


	public List<TelefoneInputDto> getListatelefones() {
		return listatelefones;
	}


	public List<EmailDto> getEmails() {
		return emails;
	}


	public List<EnderecoInputDto> getEnderecos() {
		return enderecos;
	}
	

	public Agenda builder (AgendaInputDto agendaInputDto) {
		List<Endereco> enderecos = agendaInputDto.enderecos.stream().map(EnderecoInputDto::converte).collect(Collectors.toList());
		List<Email> emails = agendaInputDto.emails.stream().map(EmailDto::converte).collect(Collectors.toList());
		List<Telefone>listatelefones = agendaInputDto.listatelefones.stream().map(TelefoneInputDto::converte).collect(Collectors.toList());
		return new Agenda(nome, sobrenome, dataNascimento,listatelefones, emails, enderecos);
	}
	
	
}
