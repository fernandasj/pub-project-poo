package modelo;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author fernanda
 */
public class Cliente extends Pessoa {

    private String email;

    public Cliente(String email, String cpf, String nome, String telefone,
            LocalDate dataNascimento) {
        super(cpf, nome, telefone, dataNascimento);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Cliente{" + "email=" + email + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.email);
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
        final Cliente other = (Cliente) obj;
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        return true;
    }
}
