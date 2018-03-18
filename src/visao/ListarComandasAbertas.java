package visao;

import dao.ComandaDao;
import java.util.List;
import modelo.Comanda;

/**
 *
 * @author fernanda
 */
public class ListarComandasAbertas {
    public static void run(ComandaDao cadastro) {
                
        List<Comanda> comandas = cadastro.listarPeloStatus(Comanda.ABERTA);

        if (comandas.size() == 0) {
            System.out.println("NÃO HÁ COMANDAS ABERTAS");
        } else {
            for (Comanda comanda: comandas) {
                System.out.println(comanda);
            }
        }
    }
}
