package modelo;

import dao.FuncionarioDao;
import java.io.IOException;

/**
 * Classe que implementa um login default, permitindo a realização de autenticação
 * no sistema.
 * @author fernanda
 * 
 */
public class LoginFuncionario {

    private final FuncionarioDao fd;
    private  Funcionario funcionario; 
    
    /**
     * Construtor estático da classe, com valores já definidos para todos os
     * seus atributos.
     */

    public LoginFuncionario() throws IOException {
        this.funcionario = null;
        this.fd = new FuncionarioDao();
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
    
    public boolean login(String usuario, String senha) throws IOException, 
            ClassNotFoundException {
        
        Funcionario login = fd.buscar(usuario);
        if (login != null) {
            if (login.getSenha().equals(senha)) {
                this.funcionario = login;
                return true;
            }
        } 
        return false;
    }
}
