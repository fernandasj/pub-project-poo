package modelo;

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
    
    
}
