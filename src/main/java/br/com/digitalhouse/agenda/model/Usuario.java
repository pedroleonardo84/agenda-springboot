package br.com.digitalhouse.agenda.model;

import java.util.Collection;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

@Entity
public class Usuario implements UserDetails {
	/**
	 * 
	 */
	private static final long serialVersionUID = 340696419167137574L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String email;
	private String senha;
	@ManyToMany(fetch = FetchType.EAGER)
	private Set<Perfil> perfis;
	
	public Usuario(String email, String senha, Set<Perfil> perfis) {
		this.email = email;
		this.senha = senha;
		this.perfis = perfis;
	}
	
	public Usuario() {}
	
	public Integer getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getSenha() {
		return senha;
	}
	public Set<Perfil> getPerfis() {
		return perfis;
	}
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return perfis;
	}
	@Override
	public String getPassword() {
		return senha;
	}
	@Override
	public String getUsername() {
		return email;
	}
	@Override
	public boolean isAccountNonExpired() {
		return true;
	}
	@Override
	public boolean isAccountNonLocked() {
		return true;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}
	@Override
	public boolean isEnabled() {
		return true;
	}
	
	
	
	
}
