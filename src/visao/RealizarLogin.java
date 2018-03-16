package visao;

import java.util.Scanner;
import modelo.Funcionario;
import modelo.LoginFuncionario;

/**
 *
 * @author fernanda
 */
public class RealizarLogin {
    public static void run() {
        LoginFuncionario autenticar = new LoginFuncionario();
    
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("USUARIO:");
        String usuario = scanner.nextLine();
        
        System.out.print("SENHA:");
        String senha = scanner.nextLine();
        
        if(autenticar.login(usuario, senha)) {
            Funcionario funcionario = autenticar.getFuncionario();
            System.out.println("OLÁ, "+autenticar.getFuncionario().getNome());
        }else{
            System.out.println("USUARIO E/OU SENHA INCORRETO(S)");
        }    
    }    
}
