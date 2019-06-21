package br.com.bitscamp.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.bitscamp.chatbot.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // @Query("SELECT id_estado FROM Person p JOIN FETCH p.roles WHERE p.id = (:id)")
    // public Person findByIdAndFetchRolesEagerly(@Param("id") Long id);
}