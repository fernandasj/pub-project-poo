package visao;

import dao.ComandaDao;
import java.util.Scanner;
import modelo.Funcionario;

/**
 *
 * @author fernanda
 */
public class MostrarMenu {
    
    private ComandaDao cadastro;
    private Funcionario funcionario;

    public MostrarMenu(Funcionario funcionario) {
        this.cadastro = new ComandaDao();
        this.funcionario = funcionario;
    }
    
    public void run() {
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
                AbrirComanda.run(this.cadastro);
                break;
            case 2:
                RealizarPedido.run(this.funcionario, this.cadastro);
                break;
            case 3:
                FecharComanda.run(this.cadastro);
                break;
            case 4:
                ListarComandasAbertas.run(this.cadastro);
                break;
            case 5:
                System.exit(0);
                break;
        }

        this.run();
    }
}
