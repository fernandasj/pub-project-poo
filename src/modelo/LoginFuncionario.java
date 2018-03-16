package modelo;

import java.time.LocalDate;
import java.time.Month;

/**
 * Classe que implementa um login default, permitindo a realização de autenticação
 * no sistema.
 * @author fernanda
 * 
 */
public class LoginFuncionario {

    private final String usuario;
    private final String senha;
    private final Funcionario funcionario;
    
    /**
     * Construtor estático da classe, com valores já definidos para todos os
     * seus atributos.
     */

    public LoginFuncionario() {
        this.usuario = "admin";
        this.senha = "admin123";
        this.funcionario = new Funcionario(954.00f, "Feminino", 
                LocalDate.of(1998, Month.OCTOBER, 11), "Garconete", 
                "Rua Coronel Juvêncio Carneiro 489", "Centro", "Cajazeiras", 
                "505.761.694-39", "Nair Aparecida Lucia da Costa", 
                "(83) 2799-3341", LocalDate.now());
    }
    
    /**
     * @return O nome usuario. 
     */
    
    public String getUsuario() {
        return usuario;
    }
    
    /**
     * @return O valor da senha. 
     */
    
    public String getSenha() {
        return senha;
    }

    /**
     * @return O Funcionário. 
     */
    
    public Funcionario getFuncionario() {
        return funcionario;
    }
    
    /**
     * @param usuario nome de usuário que será utilizado para realizar a autenticação.
     * @param senha valor da senha que será utilizado para realizar a autenticação.
     * @return Resultado da autenticação, que pode ser: true, caso usuario e senha
     * estejam corretos, caso contrário o resultado será: false.
     */
    
    public boolean login (String usuario, String senha) {
        return this.usuario == usuario && this.senha == senha;
    }
}
