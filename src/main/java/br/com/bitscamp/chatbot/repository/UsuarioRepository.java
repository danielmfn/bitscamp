package br.com.bitscamp.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
// import org.springframework.data.jpa.repository.Query;
// import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

// import br.com.bitscamp.chatbot.model.Estado;
import br.com.bitscamp.chatbot.model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    // @Query("SELECT id_estado FROM Estado e JOIN FETCH e.roles WHERE p.id = (:id)")
    // public Estado findByIdEstado(@Param("id") Long id);
}