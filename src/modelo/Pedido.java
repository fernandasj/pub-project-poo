package modelo;

import java.time.LocalDateTime;
import java.util.Objects;

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
    private float precoProduto;
    private Produto produto;
    private Funcionario funcionario;
    private Comanda comanda;

    public Pedido(int id, LocalDateTime horario, String observacao, String status,
            int quantidade, Produto produto, Funcionario funcionario, 
            Comanda comanda) {
        this.id = id;
        this.horario = horario;
        this.observacao = observacao;
        this.status = status;
        this.quantidade = quantidade;
        this.precoProduto = produto.getPreco();
        this.produto = produto;
        this.funcionario = funcionario;
        this.comanda = comanda;
        
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

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Comanda getComanda() {
        return comanda;
    }

    public void setComanda(Comanda comanda) {
        this.comanda = comanda;
    }

    public float getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(float precoProduto) {
        this.precoProduto = precoProduto;
    }
      
    public float calcularSubtotal(){
        return quantidade * precoProduto;
    }
    
    @Override
    public String toString() {
        return "Pedido{" + "id=" + id + ", horario=" + horario + ", observacao="
                + observacao + ", status=" + status + ", quantidade=" 
                + quantidade + ", precoProduto=" + precoProduto + ","
                + "produto=" + produto + ", funcionario=" + funcionario + ","
                + " comanda=" + comanda + "}";
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + this.id;
        hash = 83 * hash + Objects.hashCode(this.horario);
        hash = 83 * hash + Objects.hashCode(this.observacao);
        hash = 83 * hash + Objects.hashCode(this.status);
        hash = 83 * hash + this.quantidade;
        hash = 83 * hash + Float.floatToIntBits(this.precoProduto);
        hash = 83 * hash + Objects.hashCode(this.produto);
        hash = 83 * hash + Objects.hashCode(this.funcionario);
        hash = 83 * hash + Objects.hashCode(this.comanda);
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
        final Pedido other = (Pedido) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.quantidade != other.quantidade) {
            return false;
        }
        if (Float.floatToIntBits(this.precoProduto) != Float.floatToIntBits(other.precoProduto)) {
            return false;
        }
        if (!Objects.equals(this.observacao, other.observacao)) {
            return false;
        }
        if (!Objects.equals(this.status, other.status)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        if (!Objects.equals(this.comanda, other.comanda)) {
            return false;
        }
        return true;
    }   
}
