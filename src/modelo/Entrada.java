package modelo;

/**
 *
 * @author fernanda
 */
public abstract class Entrada {
    private int id;
    private String status;
    private float valor;
    
    public Entrada(){
     
    }

    public Entrada(int id, String status, float valor) {
        this.id = id;
        this.status = status;
        this.valor = valor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Entrada{" + "id=" + id + ", status=" + status + ", "
                + "valor=" + valor + '}';
    }    
}
