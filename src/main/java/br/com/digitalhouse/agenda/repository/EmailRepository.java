package br.com.digitalhouse.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.digitalhouse.agenda.model.Email;

@Repository
public interface EmailRepository extends JpaRepository<Email, Integer> {

}
