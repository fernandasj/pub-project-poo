package visao;

import dao.ProdutoDao;
import modelo.Produto;

/**
 *
 * @author fernanda
 */
public class ListarProdutos {

    public static void run(ProdutoDao produtos) {
        for (Produto produto : produtos.listar()) {
            System.out.println(produto);
        }
    }

}
