package visao;

import java.util.ArrayList;
import java.util.List;
import modelo.Produto;

/**
 *
 * @author fernanda
 */
public class ListarProdutos {
    public static void run() {
        List produtos = new ArrayList<>();
        
        Produto fava = new Produto(1, "porção individual", 12f, "Fava");
        produtos.add(fava);
        
        Produto batata = new Produto(2, "porção individual", 13f, "Batata frita");
        produtos.add(batata);
        
        Produto refrigerante = new Produto(3, "1000ml", 8f, "Coca-cola");
        produtos.add(refrigerante);
        
        Produto peixe = new Produto(4, "Acompanha: baião, pirão e salada", 40f,
                "Peixe frito");
        produtos.add(peixe);
        
        Produto cervejaSkol = new Produto(5, "600ml", 6f, "Skol 600ml");
        produtos.add(cervejaSkol);
        
        Produto coco = new Produto(6, "unidade", 3.5f, "Coco natural");
        produtos.add(coco);
        
        for (Object produto : produtos) {
            System.out.println(produto);
        }   
    }
    
}
