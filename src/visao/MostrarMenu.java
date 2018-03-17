package visao;

import dao.ComandaDao;
import java.util.Scanner;

/**
 *
 * @author fernanda
 */
public class MostrarMenu {

    public static void run() {
        System.out.println("============= MENU ============== \n "
                + "=== | 1 - ABRIR COMANDA   | === \n "
                + "=== | 2 - REALIZAR PEDIDO | === \n"
                + " === | 3 - FECHAR COMANDA  | === \n "
                + "=== | 4 - COMANDAS ABERTAS| === \n"
                + " === | 5 - SAIR            | === \n"
                + "=================================");

        Scanner scanner = new Scanner(System.in);

        System.out.print("OPÇÂO: ");
        Integer opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                AbrirComanda.run();
                break;
                
            case 2:
                RealizarPedido.run();
                break;
                
            case 3:
                FecharComanda.run();
                break;
                
            case 4:
                
                ListarComandasAbertas.run();
                break;
                
            case 5:
                System.exit(0);
                break;
        }
    }
}
