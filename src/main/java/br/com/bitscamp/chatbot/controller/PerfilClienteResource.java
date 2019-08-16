package br.com.bitscamp.chatbot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.bitscamp.chatbot.model.PerfilCliente;
import br.com.bitscamp.chatbot.repository.PerfilClienteRepository;

@RestController
@RequestMapping("/perfilCliente")
public class PerfilClienteResource {

    @Autowired
    private PerfilClienteRepository perfilCliente;

    @PostMapping
    public PerfilCliente adicionar(@Valid @RequestBody PerfilCliente perfil) {
        return perfilCliente.save(perfil);
    }

    @GetMapping
    public List<PerfilCliente> listar() {
        return perfilCliente.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PerfilCliente> buscar(@PathVariable Long id) {
        PerfilCliente perfil = perfilCliente.findById(id).orElse(null);

        if (perfil == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(perfil);
    }

    @PutMapping("/{id}")
	public ResponseEntity<PerfilCliente> atualizar(@PathVariable Long id, 
		@Valid @RequestBody PerfilCliente perfil) {
            PerfilCliente existente = perfilCliente.findById(id).orElse(null);
		
            if (existente == null) {
                return ResponseEntity.notFound().build();
            }
		
            BeanUtils.copyProperties(perfil, existente, "id");
            
            existente = perfilCliente.save(existente);
            
            return ResponseEntity.ok(existente);
    }
    
    @DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		PerfilCliente perfil = perfilCliente.findById(id).orElse(null);
		
		if (perfil == null) {
			return ResponseEntity.notFound().build();
		}
		
		perfilCliente.delete(perfil);
		
        return ResponseEntity.noContent().build();
    }
    
}