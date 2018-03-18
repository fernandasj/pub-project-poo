package visao;

import java.util.Scanner;
import dao.ComandaDao;
import java.util.List;
import modelo.Comanda;

/**
 *
 * @author fernanda
 */
public class FecharComanda {

    public static void run(ComandaDao cadastro) {
        Scanner scanner = new Scanner(System.in);

        cadastro.listarPeloStatus("ABERTS");

        System.out.print("ID DA COMANDA: ");
        Integer id = scanner.nextInt();

        if (cadastro.fecharComanda(id)) {
            System.out.println("COMANDA: " + cadastro.buscar(id) + " FECHADA COM SUCESSO");
        } else {
            System.out.println("NÃO FOI POSSÍVEL FECHAR A COMANDA. \n"
                    + "VERIFIQUE O NÚMERO DO ID E TENTE NOVAMENTE.");
        }

        System.out.println("HISTÓRICO DE COMANDAS FECHADAS");
        
        List<Comanda> comandas = cadastro.listarPeloStatus(Comanda.FECHADA);

        if (comandas.size() == 0) {
            System.out.println("NÃO HÁ COMANDAS FECHADAS");
        } else {
            for (Comanda comanda : comandas) {
                System.out.println(comanda);
            }
        }
    }

}
