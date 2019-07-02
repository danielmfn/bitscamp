package br.com.bitscamp.chatbot.repository;

import br.com.bitscamp.chatbot.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bitscamp.chatbot.model.CategoriaUsuario;

import java.util.List;

@Repository
public interface CategoriaUsuarioRepository extends JpaRepository<CategoriaUsuario, Long> {

	List<CategoriaUsuario> findByUsuariosIn(Usuario usuario);

}