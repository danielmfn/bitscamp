package br.com.bitscamp.chatbot.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

//import org.springframework.security.core.GrantedAuthority;

@Entity
@Table(name = "tb_categoria_usuario")
public class CategoriaUsuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categoria_usuario")
    private Long id;

    @Column(name = "categoria_usuario")
    private String categoria;


    @ManyToMany
    private List<Permissao> permissoes;

    @OneToMany(mappedBy = "categoria")
    private List<Usuario> usuarios;

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        CategoriaUsuario other = (CategoriaUsuario) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }
    
    public CategoriaUsuario() {
    }

    public CategoriaUsuario(String categoria, List<Permissao> permissoes, List<Usuario> usuarios) {
        this.categoria = categoria;
        this.permissoes = permissoes;
        this.usuarios = usuarios;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    public List<Permissao> getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(List<Permissao> permissoes) {
        this.permissoes = permissoes;
    }

}