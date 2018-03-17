package visao;

import dao.ComandaDao;

/**
 *
 * @author fernanda
 */
public class ListarComandasAbertas {
    public static void run() {
        ComandaDao cadastro = new ComandaDao();
        
        if(cadastro.listarPeloStatus("ABERTA") == null){
            System.out.println("NÃO HÁ COMANDAS ABERTAS");
        }
        MostrarMenu.run();
    }
}
