package br.com.digitalhouse.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.agenda.dto.LoginDto;
import br.com.digitalhouse.agenda.dto.TokenDto;
import br.com.digitalhouse.agenda.service.TokenService;


@RestController
@RequestMapping("login")
public class AuthController {
	
	@Autowired
	AuthenticationManager authenticationManager;
	
	@Autowired
	TokenService tokenService;
	
	@PostMapping
	public ResponseEntity<TokenDto> login(@RequestBody LoginDto loginDto) {
		 Authentication authenticate = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginDto.getEmail(),loginDto.getSenha()));
		 String token = tokenService.geraToken(authenticate);
		 return ResponseEntity.ok(new TokenDto(token,"Bearer"));
	}
	

}
