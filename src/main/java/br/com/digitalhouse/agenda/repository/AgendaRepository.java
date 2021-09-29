package br.com.digitalhouse.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.digitalhouse.agenda.model.Agenda;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Integer> {
	Agenda findByNome(String nome);
}
