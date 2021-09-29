package br.com.digitalhouse.agenda.service;

import java.util.List;

import br.com.digitalhouse.agenda.model.Agenda;

public interface AgendaService {
	
	public Agenda salvar(Agenda agenda);
	
	List<Agenda> buscarTodos();

	Agenda buscarPorId(Integer id);

	void excluir(Integer id);
	
	Agenda buscaPorNome(String nome);

}
