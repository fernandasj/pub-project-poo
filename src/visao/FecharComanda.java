package visao;

import java.util.Scanner;
import dao.ComandaDao;

/**
 *
 * @author fernanda
 */
public class FecharComanda {

    public static void run() {
        Scanner scanner = new Scanner(System.in);

        ComandaDao comanda = new ComandaDao();

        comanda.listarPeloStatus("ABERTS");

        System.out.print("ID DA COMANDA: ");
        Integer id = scanner.nextInt();

        if (comanda.fecharComanda(id)) {
            System.out.println("COMANDA: " + comanda.buscar(id) + "FECHADA COM SUCESSO");
        } else {
            System.out.println("NÃO FOI POSSÍVEL FECHAR A COMANDA. \n"
                    + "VERIFIQUE O NÚMERO DO ID E TENTE NOVAMENTE.");
        }

        System.out.println("HISTÓRICO DE COMANDAS FECHADAS");
        comanda.listarPeloStatus("FECHADA");

        MostrarMenu.run();
    }

}
