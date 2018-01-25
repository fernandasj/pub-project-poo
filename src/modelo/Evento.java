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
    
    public Evento(int numPessoas, LocalDate dataInicio, 
            LocalDate dataFim, String descricao, Cliente cliente, 
            int id, String status, float valor) {
        super(id, status, valor);
        this.numPessoas = numPessoas;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.descricao = descricao;
        this.cliente = cliente;
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

    @Override
    public String toString() {
        return "Evento{" + "numPessoas=" + numPessoas + ", "
                + "dataInicio=" + dataInicio + ", dataFim=" + dataFim + ", "
                + "descricao=" + descricao + ", cliente=" + cliente + '}';
    }  
    
}
    
    