package br.com.digitalhouse.agenda.config;

import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.digitalhouse.agenda.model.Usuario;
import br.com.digitalhouse.agenda.repository.UsuarioRepository;

@Service
public class AutenticacaoService implements UserDetailsService{

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = usuarioRepository.findByEmail(username);
		if (usuario.isPresent()) {
			return usuario.get();
		} 
		throw new UsernameNotFoundException("Usuario nao encontrado para o e-mail informado");
	}

	public Usuario buscaPorId(Integer idUsuario) {
		return usuarioRepository.findById(idUsuario).orElseThrow(()-> new EntityNotFoundException("Usuario nao encontrado"));
	}

}
