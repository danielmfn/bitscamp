package br.com.bitscamp.chatbot.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "tb_usuario")
public class Usuario implements Serializable{

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_usuario", nullable = false)
    private String nome;

    @Column(name = "email_usuario")
    private String email;

    @Column(name = "senha_usuario")
    private String senha;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Municipio municipio;

    @Column(name = "nome_estado")
    private Estado estado;

    @Column(name = "endereco_usuario")
    private String endereco;

    @Column(name = "cep_usuario")
    private Long cep;

    @ManyToOne
    @JoinColumn(name = "id_categoria_usuario", nullable = false)
    private CategoriaUsuario categoriaUsuario;

    @ManyToOne
    @JoinColumn(name = "id_perfil_cliente", nullable = false)
    private PerfilCliente perfilCliente;

    public Usuario() {
    }

    public Usuario(Long id, String nome, String email, String senha, Municipio municipio, Estado estado,
            String endereco, Long cep, CategoriaUsuario categoriaUsuario, PerfilCliente perfilCliente) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.municipio = municipio;
        this.estado = estado;
        this.endereco = endereco;
        this.cep = cep;
        this.categoriaUsuario = categoriaUsuario;
        this.perfilCliente = perfilCliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public CategoriaUsuario getCategoriaUsuario() {
        return categoriaUsuario;
    }

    public void setCategoriaUsuario(CategoriaUsuario categoriaUsuario) {
        this.categoriaUsuario = categoriaUsuario;
    }

    public PerfilCliente getPerfilCliente() {
        return perfilCliente;
    }

    public void setPerfilCliente(PerfilCliente perfilCliente) {
        this.perfilCliente = perfilCliente;
    }

    public Municipio getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

}