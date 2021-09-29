package br.com.digitalhouse.agenda.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import br.com.digitalhouse.agenda.model.Agenda;
import br.com.digitalhouse.agenda.repository.AgendaRepository;

public class AgendaServiceImpl implements AgendaService{

	private final AgendaRepository agendaRepository;
	
	public AgendaServiceImpl(AgendaRepository agendaRepository) {
		this.agendaRepository = agendaRepository;
	}
	
	@Override
	public Agenda salvar(Agenda agenda) {
		return this.agendaRepository.save(agenda);
	}

	@Override
	public List<Agenda> buscarTodos() {
		return this.agendaRepository.findAll();
	}

	@Override
	public Agenda buscarPorId(Integer id) {
		return agendaRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("Não foi encontrado contato cadastrado para o id " + id + " informado"));
	}

	@Override
	public void excluir(Integer id) {
		 this.agendaRepository.delete(buscarPorId(id));
	}

	@Override
	public Agenda buscaPorNome(String nome) {
		return this.agendaRepository.findByNome(nome);
	}
	
	

}
