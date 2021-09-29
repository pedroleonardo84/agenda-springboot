package br.com.digitalhouse.agenda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.security.core.GrantedAuthority;

@Entity
public class Perfil implements GrantedAuthority {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7008735215363341612L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	
	
	public Perfil() {};
	
	
	public Perfil(Integer id, String nome) {
		this.id = id;
		this.nome = nome;
	}



	public Integer getId() {
		return id;
	}



	public String getNome() {
		return nome;
	}



	public Perfil(String nome) {
		this.nome = nome;
	}



	@Override
	public String getAuthority() {
		// TODO Auto-generated method stub
		return null;
	}

}
