package br.com.bitscamp.chatbot.security;

import br.com.bitscamp.chatbot.model.CategoriaUsuario;
import br.com.bitscamp.chatbot.model.Permissao;
import br.com.bitscamp.chatbot.model.Usuario;
import br.com.bitscamp.chatbot.repository.CategoriaUsuarioRepository;
import br.com.bitscamp.chatbot.repository.PermissaoRepository;
import br.com.bitscamp.chatbot.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Component
public class UsuarioUserDetailService implements UserDetailsService {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@Autowired
	private CategoriaUsuarioRepository categorias;

	@Autowired
	private PermissaoRepository permissoes;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Usuario usuario = usuarioRepository.findByemail(email);

		if (usuario == null) {

			throw new UsernameNotFoundException("Usuário não encontrado!");
		}

		return new UsuarioSistema(usuario.getEmail(), usuario.getSenha(), authorities(usuario), usuario.getNome());

	}

	public Collection<? extends GrantedAuthority> authorities(Usuario usuario) {
		return authorities(categorias.findByUsuariosIn(usuario));
	}

	public Collection<? extends GrantedAuthority> authorities(List<CategoriaUsuario> categorias) {
		Collection<GrantedAuthority> auths = new ArrayList<>();

		for (CategoriaUsuario categoria: categorias) {
			List<Permissao> lista = permissoes.findByCategoriasIn(categoria);

			for (Permissao permissao: lista) {
				auths.add(new SimpleGrantedAuthority("ROLE_" + permissao.getNome()));
			}
		}

		return auths;
	}

}
