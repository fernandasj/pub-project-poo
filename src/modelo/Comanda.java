package modelo;

/**
 *
 * @author fernanda
 */
public class Comanda extends Entrada {
    private int numMesa;
    private Pedido pedido;

    public Comanda(int numMesa, Pedido pedido, int codigo, String status, float valor) {
        super(codigo, status, valor);
        this.numMesa = numMesa;
        this.pedido = pedido;
    }

    public int getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(int numMesa) {
        this.numMesa = numMesa;
    }

    public Pedido getpedido() {
        return pedido;
    }

    public void setpedido(Pedido pedido) {
        this.pedido = pedido;
    }

    @Override
    public String toString() {
        return "Comanda{" + "numMesa=" + numMesa + ", pedido=" + pedido + '}';
    }
}
