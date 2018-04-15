package dao;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
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

    private File file;

    /**
     * Cria um novo Dao com uma uma lista preechida estaticamente
     */
    public ProdutoDao() throws IOException {
        file = new File("Arquivos/produtos.bin");
        
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    /**
     * @param p elemento com tipo Produto que será salvo na lista. Antes de
     * salvar o produto, é verificado se ele já existe, comparando o id. Caso
     * exista é retornado FALSE.
     * @return A confirmação da inserção.
     */
    @Override
    public boolean salvar(Produto p) throws IOException, FileNotFoundException, 
            ClassNotFoundException {
        
        if(buscar(p.getId()) == null){
            List <Produto> produtos = listar();
            
            if(produtos.add(p)){
                atualizarArquivo(produtos);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }   
    }

    /**
     * @param p elemento com tipo Produto que será deletado da lista.
     * @return A confirmação da exclusão.
     */
    
    @Override
    public boolean deletar(Produto p) throws IOException, FileNotFoundException, 
            ClassNotFoundException {
        
        List<Produto> produtos = listar();
        
        if (produtos.remove(p)) {
            atualizarArquivo(produtos);
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param id número do id do produto que será buscado na lista. Antes de
     * buscar, é verificado se o produto existe. Caso não exista é retornado
     * NULL.
     * @return A comanda desejada.
     */
    @Override
    public Produto buscar(String id) throws IOException, FileNotFoundException, 
            ClassNotFoundException {
        
        List <Produto> produtos = listar();
        
        for (Produto produto : produtos) {
            if (id.equals(produto.getId())) {
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
    public boolean atualizar(Produto produto) throws IOException, FileNotFoundException,
            ClassNotFoundException {
        
        List <Produto> produtos = listar();
        
        for (int i = 0; i < produtos.size(); i++) {
            if (produtos.get(i).getId().equals(produto.getId())) {
                produtos.set(i, produto);
                atualizarArquivo(produtos);
                return true;
            }
        }
        return false;
    }

    /**
     * @return Todas os produtos da lista.
     */
    @Override
    public List<Produto> listar() throws FileNotFoundException, IOException, 
            ClassNotFoundException {
        
        if(file.length() > 0){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            
            return (List<Produto>) in.readObject();
            
        } else {
            return new ArrayList<>();
        }
    }

    private void atualizarArquivo(List<Produto> produtos) throws FileNotFoundException, 
            IOException {
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

        out.writeObject(produtos);
        out.close();
    }
}

  
