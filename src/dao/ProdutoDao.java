package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Produto;

/**
 *
 * @author fernanda
 */
public class ProdutoDao implements DaoGeneric<Produto> {

    private List<Produto> produtos;

    public ProdutoDao() {
        produtos = new ArrayList<>();
    }

    @Override
    public boolean salvar(Produto p) {
        for (Produto produto : produtos) {
            if (p.equals(produto)) {
                return false;
            }
        }
        return produtos.add(p);
    }

    @Override
    public boolean deletar(Produto p) {
        return produtos.remove(p);
    }

    @Override
    public Produto buscar(int id) {
        for (Produto produto : produtos) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

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

    @Override
    public List<Produto> listar() {
        for (Produto produto : produtos) {
            System.out.println(produto); 
        }
        return null;
    }
}

