package modelo;

import java.time.LocalDate;

/**
 *
 * @author fernanda
 */
public class Funcionario extends Pessoa {
    private float salario;
    private String sexo;
    private LocalDate dataAdmissao;
    private String cargo;
    private String rua;
    private String bairro;
    private String cidade;
    private Evento evento;

    public Funcionario(float salario, String sexo, LocalDate dataAdmissao, 
            String cargo, String rua, String bairro, String cidade, 
            Evento evento, String cpf, String nome, String telefone, 
            LocalDate dataNascimento) {
        
        super(cpf, nome, telefone, dataNascimento);
        this.salario = salario;
        this.sexo = sexo;
        this.dataAdmissao = dataAdmissao;
        this.cargo = cargo;
        this.rua = rua;
        this.bairro = bairro;
        this.cidade = cidade;
        this.evento = evento;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public LocalDate getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(LocalDate dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "salario=" + salario + ", sexo=" + sexo + ", "
                + "dataAdmissao=" + dataAdmissao + ", cargo=" + cargo + ", "
                + "rua=" + rua + ", bairro=" + bairro + ", "
                + "cidade=" + cidade + ", evento=" + evento + '}';
    } 
}
