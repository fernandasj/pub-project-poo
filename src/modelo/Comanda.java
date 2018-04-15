package modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author fernanda
 */
public class Comanda extends Entrada implements Serializable {
    
    public static final String ABERTA = "ABERTA";
    public static final String FECHADA = "FECHADA";
    
    private int numMesa;
    private List<Pedido> pedidos;

    public Comanda(String id, String status, float valor, int numMesa) {
        super(id, status, valor);
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
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.numMesa;
        hash = 67 * hash + Objects.hashCode(this.pedidos);
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
    
    

    @Override
    public String toString() {
        return this.getId() + " - Mesa: " + numMesa;
    }

}
