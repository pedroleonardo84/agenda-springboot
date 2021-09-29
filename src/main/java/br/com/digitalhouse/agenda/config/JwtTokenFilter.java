package br.com.digitalhouse.agenda.config;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import br.com.digitalhouse.agenda.model.Usuario;
import br.com.digitalhouse.agenda.service.TokenService;

public class JwtTokenFilter extends OncePerRequestFilter{
	
	private TokenService tokenservice;
	private AutenticacaoService autenticacaoservice;

	public JwtTokenFilter(TokenService tokenservice, AutenticacaoService autenticacaoservice) {
		this.tokenservice = tokenservice;
		this.autenticacaoservice = autenticacaoservice;
	}
	
	
	private String getToken(HttpServletRequest request) {
		String token = request.getHeader("Authorization");
		if (token == null || token.isEmpty() || !token.startsWith("Bearer ")) {
			return null;
		}
		return token.substring(7);
	}
	
	private void autenticaUsuario(String token) {
		Integer idUsuario = tokenservice.getUsuarioId(token);
		Usuario usuario = autenticacaoservice.buscaPorId(idUsuario);
		UsernamePasswordAuthenticationToken authenticathion = 
				new UsernamePasswordAuthenticationToken(usuario,null,usuario.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(authenticathion);
	}


	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		String token = getToken(request);
		if (tokenservice.validaToken(token)) {autenticaUsuario(token);}
		filterChain.doFilter(request, response);
	}

}
