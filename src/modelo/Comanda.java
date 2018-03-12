package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.numMesa;
        hash = 29 * hash + Objects.hashCode(this.pedidos);
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
        final Comanda other = (Comanda) obj;
        if (this.numMesa != other.numMesa) {
            return false;
        }
        if (!Objects.equals(this.pedidos, other.pedidos)) {
            return false;
        }
        return true;
    }   
}
