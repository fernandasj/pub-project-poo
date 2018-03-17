package visao;

import dao.ProdutoDao;
import java.util.ArrayList;
import java.util.List;
import modelo.Produto;

/**
 *
 * @author fernanda
 */
public class ListarProdutos {

    public static void run() {
        
        ProdutoDao produtos = new ProdutoDao();

        Produto fava = new Produto(1, "porção individual", 12f, "Fava");
        produtos.salvar(fava);

        Produto batata = new Produto(2, "porção individual", 13f, "Batata frita");
        produtos.salvar(batata);

        Produto refrigerante = new Produto(3, "1000ml", 8f, "Coca-cola");
        produtos.salvar(refrigerante);

        Produto peixe = new Produto(4, "Acompanha: baião, pirão e salada", 40f,
                "Peixe frito");
        produtos.salvar(peixe);

        Produto cervejaSkol = new Produto(5, "600ml", 6f, "Skol 600ml");
        produtos.salvar(cervejaSkol);

        Produto coco = new Produto(6, "unidade", 3.5f, "Coco natural");
        produtos.salvar(coco);
  
        System.out.print(produtos.listar());

    }

}
