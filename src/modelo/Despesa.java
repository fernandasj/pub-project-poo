package modelo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author fernanda
 */
public class Despesa {
    private Funcionario funcionario;
    private Fornecedor fornecedor;
    private LocalDateTime lancamento;  
    private LocalDate data;
    private float valorTotal;
       
    public Despesa(Funcionario funcionario, Fornecedor fornecedor, 
            LocalDateTime lancamento, LocalDate data, float valorTotal) {
        
        this.funcionario = funcionario;
        this.fornecedor = fornecedor;
        this.lancamento = lancamento;
        this.data = data;
        this.valorTotal = valorTotal;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Fornecedor getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Fornecedor fornecedor) {
        this.fornecedor = fornecedor;
    }

    public LocalDateTime getLancamento() {
        return lancamento;
    }

    public void setLancamento(LocalDateTime lancamento) {
        this.lancamento = lancamento;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    @Override
    public String toString() {
        return "Despesa{" + "funcionario=" + funcionario + ", "
                + "fornecedor=" + fornecedor + ", lancamento=" + lancamento + ","
                + " data=" + data + ", valorTotal=" + valorTotal + '}';
    } 

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.funcionario);
        hash = 97 * hash + Objects.hashCode(this.fornecedor);
        hash = 97 * hash + Objects.hashCode(this.lancamento);
        hash = 97 * hash + Objects.hashCode(this.data);
        hash = 97 * hash + Float.floatToIntBits(this.valorTotal);
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
        final Despesa other = (Despesa) obj;
        if (Float.floatToIntBits(this.valorTotal) != Float.floatToIntBits(other.valorTotal)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        if (!Objects.equals(this.fornecedor, other.fornecedor)) {
            return false;
        }
        if (!Objects.equals(this.lancamento, other.lancamento)) {
            return false;
        }
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        return true;
    }
    
    
}
