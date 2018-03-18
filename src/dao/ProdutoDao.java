package dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import modelo.Produto;

/**
 * Classe que implementa um DAO (Data Acess Object) por meio de uma lista. Essa
 * implementação permite a realização das operações do CRUD (CREAT-READ-UPDATE-
 * DELETE).
 *
 * @author fernanda
 * @see java.util.List
 * @see java.util.ArrayList
 */
public class ProdutoDao implements DaoGeneric<Produto> {

    private List<Produto> produtos;

    /**
     * Cria um novo Dao com uma uma lista preechida estaticamente
     */
    public ProdutoDao() {
        produtos = new ArrayList<>();
        produtos = new ArrayList<>(Arrays.asList(
                new Produto(1, "porção individual", 12f, "Fava"),
                new Produto(2, "porção individual", 13f, "Batata frita"),
                new Produto(3, "1000ml", 8f, "Coca-cola"),
                new Produto(4, "Acompanha: baião, pirão e salada", 40f,
                "Peixe frito"),
                new Produto(5, "600ml", 6f, "Skol 600ml"),
                new Produto(6, "unidade", 3.5f, "Coco natural")));  
    }

    /**
     * @param p elemento com tipo Produto que será salvo na lista. Antes de
     * salvar o produto, é verificado se ele já existe, comparando o id. Caso
     * exista é retornado FALSE.
     * @return A confirmação da inserção.
     */
    @Override
    public boolean salvar(Produto p) {
        for (Produto produto : produtos) {
            if (p.equals(produto)) {
                return false;
            }
        }
        return produtos.add(p);
    }

    /**
     * @param p elemento com tipo Produto que será deletado da lista.
     * @return A confirmação da exclusão.
     */
    @Override
    public boolean deletar(Produto p) {
        return produtos.remove(p);
    }

    /**
     * @param id número do id do produto que será buscado na lista. Antes de
     * buscar, é verificado se o produto existe. Caso não exista é retornado
     * NULL.
     * @return A comanda desejada.
     */
    @Override
    public Produto buscar(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    /**
     * @param produto elemento com tipo Produto que será atualizado na lista.
     * Antes de atualizar,é feita uma busca pelo id para encontrar o produto que
     * se deseja modificar. Caso o produto não seja encontrado é retornado
     * FALSE.
     * @return A confirmação da atualização.
     */
    @Override
    public boolean atualizar(Produto produto) {
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).equals(produto)) {
                produtos.set(i, produto);
                return true;
            }
        }
        return false;
    }

    /**
     * @return Todas os produtos da lista.
     */
    @Override
    public List<Produto> listar() {
        return produtos;
    }
}
