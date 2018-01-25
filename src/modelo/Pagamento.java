package modelo;

import java.time.LocalDateTime;

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

    @Override
    public String toString() {
        return "Pagamento{" + "id=" + id + ", tipo=" + tipo + ", "
                + "desconto=" + desconto + ", valor=" + valor + ", "
                + "entrada=" + entrada + ", funcionario=" + funcionario + ", "
                + "horario=" + horario + '}';
    }
    
    
    
    
}
