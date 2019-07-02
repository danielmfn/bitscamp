package br.com.bitscamp.chatbot.repository;

import java.util.List;

import br.com.bitscamp.chatbot.model.CategoriaUsuario;
import br.com.bitscamp.chatbot.model.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

	List<Permissao> findByGruposIn(CategoriaUsuario categoria);

}
