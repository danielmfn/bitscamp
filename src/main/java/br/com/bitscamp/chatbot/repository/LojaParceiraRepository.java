package br.com.bitscamp.chatbot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.bitscamp.chatbot.model.Loja;

@Repository
public interface LojaParceiraRepository extends JpaRepository<Loja, Long> {

}