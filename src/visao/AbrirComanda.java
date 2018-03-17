package visao;

import dao.ComandaDao;
import java.util.Scanner;
import modelo.Comanda;

/**
 *
 * @author fernanda
 */
public class AbrirComanda {
    public static void run() {
        ComandaDao cadastro = new ComandaDao();
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("ID:");
        Integer id = scanner.nextInt();
        
        System.out.print("N° DA MESA: ");
        Integer mesa = scanner.nextInt();
        
        Comanda comanda = new Comanda(id, mesa);
        
        if(cadastro.salvar(comanda)){
            System.out.println("OPERAÇÃO REALIZADA");
        } else {
            System.out.println("NÃO FOI POSSÍVEL SALVAR A COMANDA");
        }
        MostrarMenu.run();
    }
}
