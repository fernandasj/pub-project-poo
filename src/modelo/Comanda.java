package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author fernanda
 */
public class Comanda extends Entrada {
    
    public static final String ABERTA = "ABERTA";
    public static final String FECHADA = "FECHADA";
    
    private int numMesa;
    private List<Pedido> pedidos;

    public Comanda(int id, int numMesa) {
        super(id, ABERTA, 0f);
        this.numMesa = numMesa;
        pedidos = new ArrayList<>();
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public void realizarPedido(Pedido p) {
        this.pedidos.add(p);
        this.setValor(this.getValor() + p.calcularSubtotal());
    }

    @Override
    public String toString() {
        return "Comanda{id=" + this.getId() + ", numMesa=" + numMesa
            + ", status=" + this.getStatus() + ", valor=" + this.getValor()
            + "}";
    }

}
