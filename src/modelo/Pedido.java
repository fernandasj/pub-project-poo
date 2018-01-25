package modelo;

import java.time.LocalDateTime;

/**
 *
 * @author fernanda
 */
public class Pedido {
    private int id;
    private LocalDateTime horario;
    private String observacao;
    private String status;
    private int quantidade;
    private Produto produto;

    public Pedido(int id, LocalDateTime horario, String observacao, String status,
            int quantidade, Produto produto) {
        this.id = id;
        this.horario = horario;
        this.observacao = observacao;
        this.status = status;
        this.quantidade = quantidade;
        this.produto = produto;
    }
    
    public int getId() {
        return id;
    }
    
    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", horario=" + horario + ", "
                + "observacao=" + observacao + ", status=" + status + ", "
                + "quantidade=" + quantidade + ", produto=" + produto + '}';
    }
    
    
    
    
}
