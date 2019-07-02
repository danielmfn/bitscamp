package br.com.bitscamp.chatbot.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.Collection;

public class UsuarioSistema extends User {

	private static final long SerialVersionUID = 1L;

	private String nome;

	public UsuarioSistema(String username, String password, Collection<? extends GrantedAuthority> authorities, String nome) {
		super(username, password, authorities);
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

}
