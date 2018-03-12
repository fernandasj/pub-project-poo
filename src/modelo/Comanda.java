package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernanda
 */
public class Comanda extends Entrada {
    private int numMesa;
    private List<Pedido> pedidos;

    public Comanda(int numMesa, int codigo, String status, float valor) {
        super(codigo, status, valor);
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
    
    public void calcularValor(Pedido p){
        this.pedidos.add(p);
        this.setValor(this.getValor() + p.calcularSubtotal());
    }

    @Override
    public String toString() {
        return "Comanda{" + "numMesa=" + numMesa + ", pedidos=" + pedidos + '}';
    }
}
