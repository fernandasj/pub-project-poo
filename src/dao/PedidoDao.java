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
import modelo.Pedido;

/**
 * Classe que implementa um DAO (Data Acess Object) por meio de uma lista. Essa
 * implementação permite a realização das operações do CRUD (CREAT-READ-UPDATE-
 * DELETE).
 *
 * @author fernanda
 * @see java.util.List
 * @see java.util.ArrayList
 */
public class PedidoDao implements DaoGeneric<Pedido> {
    
    private File file;
    
    /**
     * Cria um novo Dao com uma lista vazia
     */
    public PedidoDao() throws IOException{
        file = new File("Arquivos/pedidos.bin");
        
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    /**
     * @param p elemento com tipo Pedido que será salvo na lista. Antes de
     * salvar o pedido, é verificado se ele já existe, comparando o id. Caso
     * exista é retornado FALSE.
     * @return A confirmação da inserção.
     */
    @Override
    public boolean salvar(Pedido p) throws IOException, ClassNotFoundException, 
            FileNotFoundException {
        
        if(buscar(p.getId()) == null){
            List <Pedido> pedidos = listar();
            
            if(pedidos.add(p)){
                atualizarArquivo(pedidos);
                return true;
            } else{
                return false;
            }
        } else {
            return false;
        }
    }
    
    /**
     * @param p elemento com tipo Pedido que será deletado da lista.
     * @return A confirmação da exclusão.
     */
    @Override
    public boolean deletar(Pedido p) throws IOException, ClassNotFoundException, 
            FileNotFoundException {
        
        List <Pedido> pedidos = listar();
        
        if(pedidos.remove(p)){
            atualizarArquivo(pedidos);
            return true;
        } else{
            return false;
        }
    }

    /**
     * @param id número do id do pedido que será buscado na lista. Antes de
     * buscar, é verificado se o pedido existe. Caso não exista é retornado
     * NULL.
     * @return A comanda desejada.
     */
    @Override
    public Pedido buscar(String id) throws IOException, ClassNotFoundException, 
            FileNotFoundException {
        
        List <Pedido> pedidos = listar();
        
        for (Pedido pedido : pedidos) {
            if (id.equals(pedido.getId())) {
                return pedido;
            }
        }
        return null;
        
        
    }

    /**
     * @param pedido elemento com tipo Pedido que será atualizada na lista. Antes de
     * atualizar,é feita uma busca pelo id para encontrar o pedido que se
     * deseja modificar. Caso a pedido não seja encontrado é retornado FALSE.
     * @return A confirmação da atualização.
     */
    @Override
    public boolean atualizar(Pedido pedido) throws IOException, 
            ClassNotFoundException, FileNotFoundException {
        
        List <Pedido> pedidos = listar();
        
        for (int i = 0; i < pedidos.size(); i++) {
            if (pedidos.get(i).getId().equals(pedido.getId())) {
                pedidos.set(i, pedido);
                atualizarArquivo(pedidos);
                return true;
            }
        }
        return false;
    }

    /**
     * @return Todas as comandas da lista.
     */
    @Override
    public List<Pedido> listar() throws IOException, ClassNotFoundException, 
            FileNotFoundException {
        
        if(file.length() > 0){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            
            return (List<Pedido>) in.readObject();
            
        } else {
            return new ArrayList<>();
        }
    }

    private void atualizarArquivo(List<Pedido> pedidos) throws IOException {
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

        out.writeObject(pedidos);
        out.close();
    }
    
}
