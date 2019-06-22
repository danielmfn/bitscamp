package br.com.bitscamp.chatbot.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.bitscamp.chatbot.model.CategoriaUsuario;
import br.com.bitscamp.chatbot.repository.CategoriaUsuarioRepository;

@RestController
@RequestMapping("/categoriaUsuario")
public class CategoriaUsuarioResource {

    CategoriaUsuarioRepository categoriaUsuarioRepositorio;

    @PostMapping
    public CategoriaUsuario adicionar(@Valid @RequestBody CategoriaUsuario categoriaUsuario) {
        return categoriaUsuarioRepositorio.save(categoriaUsuario);
    }

    @GetMapping
    public List<CategoriaUsuario> listar() {
        return categoriaUsuarioRepositorio.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<CategoriaUsuario> buscar(@PathVariable Long id) {
        CategoriaUsuario categoriaUsuario = categoriaUsuarioRepositorio.findById(id).orElse(null);

        if (categoriaUsuario == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(categoriaUsuario);
    }

    @PutMapping("/{id}")
	public ResponseEntity<CategoriaUsuario> atualizar(@PathVariable Long id, 
		@Valid @RequestBody CategoriaUsuario usuario) {
            CategoriaUsuario existente = categoriaUsuarioRepositorio.findById(id).orElse(null);
		
            if (existente == null) {
                return ResponseEntity.notFound().build();
            }
		
            BeanUtils.copyProperties(usuario, existente, "id");
            
            existente = categoriaUsuarioRepositorio.save(existente);
            
            return ResponseEntity.ok(existente);
    }
    
    @DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		CategoriaUsuario categoriaUsuario = categoriaUsuarioRepositorio.findById(id).orElse(null);
		
		if (categoriaUsuario == null) {
			return ResponseEntity.notFound().build();
		}
		
		categoriaUsuarioRepositorio.delete(categoriaUsuario);
		
        return ResponseEntity.noContent().build();
    }
}