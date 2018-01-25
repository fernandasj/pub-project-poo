package modelo;

import java.time.LocalDate;

/**
 *
 * @author fernanda
 */
public abstract class Pessoa {
    private String cpf;
    private String nome;
    private String telefone;
    private LocalDate dataNascimento;
    
    public Pessoa(){
        
    }

    public Pessoa(String cpf, String nome, String telefone, LocalDate dataNascimento) {
        this.cpf = cpf;
        this.nome = nome;
        this.telefone = telefone;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", "
                + "telefone=" + telefone + ", "
                + "dataNascimento=" + dataNascimento + '}';
    } 
}
