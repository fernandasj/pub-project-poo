package modelo;

import java.util.Objects;

/**
 *
 * @author fernanda
 */
public abstract class Entrada {

    private int id;
    private String status;
    private float valor;

    public Entrada() {

    }

    public Entrada(int id, String status, float valor) {
        this.id = id;
        this.status = status;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + this.id;
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
        final Entrada other = (Entrada) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
}
