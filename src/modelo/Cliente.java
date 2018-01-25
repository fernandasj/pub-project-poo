package modelo;

import java.time.LocalDate;

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
    
    
    
}
