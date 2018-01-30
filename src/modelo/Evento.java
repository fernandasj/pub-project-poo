package modelo;

/**
 *
 * @author fernanda
 */

import java.time.LocalDate;

public class Evento extends Entrada {
    private int numPessoas;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String descricao;
    private Cliente cliente;
    private Funcionario funcionario;
    
    public Evento(int numPessoas, LocalDate dataInicio, 
            LocalDate dataFim, String descricao, Cliente cliente, 
            int id, String status, float valor, Funcionario funcionario) {
        super(id, status, valor);
        this.numPessoas = numPessoas;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricao = descricao;
        this.cliente = cliente;
        this.funcionario = funcionario;
    }

    public int getNumPessoas() {
        return numPessoas;
    }

    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataFim() {
        return dataFim;
    }

    public void setDataFim(LocalDate dataFim) {
        this.dataFim = dataFim;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "Evento{" + "numPessoas=" + numPessoas + ", "
                + "dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", "
                + "descricao=" + descricao + ", cliente=" + cliente + ", "
                + "funcionario=" + funcionario + '}';
    }   
}
    
    