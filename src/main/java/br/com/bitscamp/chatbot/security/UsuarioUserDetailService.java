package br.com.bitscamp.chatbot.security;

import br.com.bitscamp.chatbot.model.CategoriaUsuario;
import br.com.bitscamp.chatbot.model.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.security.core.userdetails.UserDetailsService;


@Component
public class UsuarioUserDetailService implements UserDetailsService {

	@Autowired
	private Usuario usuario;

	@Autowired
	private CategoriaUsuario categoria;



}
