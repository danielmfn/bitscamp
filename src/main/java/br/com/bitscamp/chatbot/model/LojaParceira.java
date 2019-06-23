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
@Table(name = "tb_loja_parceira")
public class LojaParceira implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_loja_parceira")
    private Long id;

    @Column(name = "cnpj_parceiro")
    private Long cnpj;

    @Column(name = "nome_empresarial")
    private String nomeEmpresarial;

    @Column(name = "email_parceiro")
    private String emailParceiro;

    @Column(name = "telefone_parceiro")
    private Long telefoneParceiro;

    @ManyToOne
    @JoinColumn(name = "id_cidade")
    private Municipio municipio;

    @Column(name = "nome_estado")
    private Estado estado;

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
        LojaParceira other = (LojaParceira) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    public LojaParceira() {
    }

    public LojaParceira(Long id, Long cnpj, String nomeEmpresarial, String emailParceiro, Long telefoneParceiro,
            Municipio municipio, Estado estado) {
        this.id = id;
        this.cnpj = cnpj;
        this.nomeEmpresarial = nomeEmpresarial;
        this.emailParceiro = emailParceiro;
        this.telefoneParceiro = telefoneParceiro;
        this.municipio = municipio;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresarial() {
        return nomeEmpresarial;
    }

    public void setNomeEmpresarial(String nomeEmpresarial) {
        this.nomeEmpresarial = nomeEmpresarial;
    }

    public String getEmailParceiro() {
        return emailParceiro;
    }

    public void setEmailParceiro(String emailParceiro) {
        this.emailParceiro = emailParceiro;
    }

    public Long getTelefoneParceiro() {
        return telefoneParceiro;
    }

    public void setTelefoneParceiro(Long telefoneParceiro) {
        this.telefoneParceiro = telefoneParceiro;
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