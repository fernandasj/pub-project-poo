package modelo;

import java.util.Objects;

/**
 *
 * @author fernanda
 */
public class Fornecedor{
    private String nome;
    private String cnpj;
    private String telefone;
    private String bairro;
    private String rua;
    private String cidade;
    private String cep;

    public Fornecedor(String nome, String cnpj, String telefone, String bairro,
            String rua, String cidade, String cep) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.telefone = telefone;
        this.bairro = bairro;
        this.rua = rua;
        this.cidade = cidade;
        this.cep = cep;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    @Override
    public String toString() {
        return "Fornecedor{" + "nome=" + nome + ", cnpj=" + cnpj + ", "
                + "telefone=" + telefone + ", bairro=" + bairro + ", "
                + "rua=" + rua + ", cidade=" + cidade + ", cep=" + cep + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 19 * hash + Objects.hashCode(this.nome);
        hash = 19 * hash + Objects.hashCode(this.cnpj);
        hash = 19 * hash + Objects.hashCode(this.telefone);
        hash = 19 * hash + Objects.hashCode(this.bairro);
        hash = 19 * hash + Objects.hashCode(this.rua);
        hash = 19 * hash + Objects.hashCode(this.cidade);
        hash = 19 * hash + Objects.hashCode(this.cep);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Fornecedor other = (Fornecedor) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cnpj, other.cnpj)) {
            return false;
        }
        if (!Objects.equals(this.telefone, other.telefone)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        if (!Objects.equals(this.rua, other.rua)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        return true;
    }
}
