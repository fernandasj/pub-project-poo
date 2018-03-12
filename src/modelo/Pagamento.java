package modelo;

import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author fernanda
 */
public class Pagamento {
    private int id;
    private String tipo;
    private float desconto;
    private float valor;
    private Entrada entrada;
    private Funcionario funcionario;
    private LocalDateTime horario;

    public Pagamento(int id, String tipo, float desconto, float valor, 
            Entrada entrada, Funcionario funcionario, LocalDateTime horario) {
        this.id = id;
        this.tipo = tipo;
        this.desconto = desconto;
        this.valor = valor;
        this.entrada = entrada;
        this.funcionario = funcionario;
        this.horario = horario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public float getDesconto() {
        return desconto;
    }

    public void setDesconto(float desconto) {
        this.desconto = desconto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public Entrada getEntrada() {
        return entrada;
    }

    public void setEntrada(Entrada entrada) {
        this.entrada = entrada;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }
    
    @Override
    public String toString() {
        return "Pagamento{" + "id=" + id + ", tipo=" + tipo + ", "
                + "desconto=" + desconto + ", valor=" + valor + ", "
                + "entrada=" + entrada + ", funcionario=" + funcionario + ", "
                + "horario=" + horario + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.tipo);
        hash = 97 * hash + Float.floatToIntBits(this.desconto);
        hash = 97 * hash + Float.floatToIntBits(this.valor);
        hash = 97 * hash + Objects.hashCode(this.entrada);
        hash = 97 * hash + Objects.hashCode(this.funcionario);
        hash = 97 * hash + Objects.hashCode(this.horario);
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
        final Pagamento other = (Pagamento) obj;
        if (this.id != other.id) {
            return false;
        }
        if (Float.floatToIntBits(this.desconto) != Float.floatToIntBits(other.desconto)) {
            return false;
        }
        if (Float.floatToIntBits(this.valor) != Float.floatToIntBits(other.valor)) {
            return false;
        }
        if (!Objects.equals(this.tipo, other.tipo)) {
            return false;
        }
        if (!Objects.equals(this.entrada, other.entrada)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        return true;
    }
}
