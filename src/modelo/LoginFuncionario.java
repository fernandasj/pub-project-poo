package modelo;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author fernanda
 */
public class LoginFuncionario {

    private final String usuario;
    private final String senha;
    private final Funcionario funcionario;

    public LoginFuncionario() {
        this.usuario = "admin";
        this.senha = "admin123";
        this.funcionario = new Funcionario(954.00f, "Feminino", LocalDate.of(1998, Month.OCTOBER, 11), "Garconete", "Rua Coronel Juvêncio Carneiro 489", "Centro", "Cajazeiras", "505.761.694-39", "Nair Aparecida Lucia da Costa", "(83) 2799-3341", LocalDate.now());
    }

    public String getUsuario() {
        return usuario;
    }

    public String getSenha() {
        return senha;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    
    public boolean login (String usuario, String senha) {
        return this.usuario == usuario && this.senha == senha;
    }
}
