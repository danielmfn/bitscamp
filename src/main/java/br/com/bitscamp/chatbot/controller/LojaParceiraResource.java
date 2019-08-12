package br.com.bitscamp.chatbot.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.bitscamp.chatbot.model.Loja;
import br.com.bitscamp.chatbot.repository.LojaParceiraRepository;

@RestController
@RequestMapping("/lojaParceira")
public class LojaParceiraResource {

    @Autowired
    private LojaParceiraRepository lojaParceira;

    @CrossOrigin
    @PostMapping
    public Loja adicionar(@Valid @RequestBody Loja loja) {
        return lojaParceira.save(loja);
    }

    @CrossOrigin
    @GetMapping
    public List<Loja> listar() {
        return lojaParceira.findAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public ResponseEntity<Loja> buscar(@PathVariable Long id) {
        Loja loja = lojaParceira.findById(id).orElse(null);

        if (loja == null) {
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(loja);
    }

    @CrossOrigin
    @PutMapping("/{id}")
	public ResponseEntity<Loja> atualizar(@PathVariable Long id, 
		@Valid @RequestBody Loja loja) {
            Loja existente = lojaParceira.findById(id).orElse(null);
		
            if (existente == null) {
                return ResponseEntity.notFound().build();
            }
		
            BeanUtils.copyProperties(loja, existente, "id");
            
            existente = lojaParceira.save(existente);
            
            return ResponseEntity.ok(existente);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
	public ResponseEntity<Void> remover(@PathVariable Long id) {
		Loja loja = lojaParceira.findById(id).orElse(null);
		
		if (loja == null) {
			return ResponseEntity.notFound().build();
		}
		
		lojaParceira.delete(loja);
		
        return ResponseEntity.noContent().build();
    }
    
}