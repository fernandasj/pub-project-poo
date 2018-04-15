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
import modelo.Comanda;

/**
 * Classe que implementa um DAO (Data Acess Object) por meio de uma lista. Essa
 * implementação permite a realização das operações do CRUD (CREAT-READ-UPDATE-
 * DELETE).
 *
 * @author fernanda
 * @see java.util.List
 * @see java.util.ArrayList
 */
public class ComandaDao implements DaoGeneric<Comanda> {

    private File file;

    /**
     * Cria um novo Dao com uma lista vazia
     */
    public ComandaDao() throws IOException {
        file = new File("Arquivos/comandas.bin");
        
        if (!file.exists()) {
            file.createNewFile();
        }
    }

    /**
     * @param c elemento com tipo Comanda que será salvo na lista. Antes de
     * salvar a comanda, é verificado se ela já existe, comparando o id. Caso
     * exista é retornado FALSE.
     * @return A confirmação da inserção.
     */
    @Override
    public boolean salvar(Comanda c) throws IOException, FileNotFoundException, 
            ClassNotFoundException {
        
        if(buscar(c.getId()) == null){
            
            List<Comanda> comandas = listar();
            
            if (comandas.add(c)) {
                atualizarArquivo(comandas);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }    
    }

    /**
     * @param c elemento com tipo Comanda que será deletado da lista.
     * @return A confirmação da exclusão.
     */
    @Override
    public boolean deletar(Comanda c) throws IOException, FileNotFoundException, 
            ClassNotFoundException {
        
        List<Comanda> comandas = listar();
        System.out.println(comandas);
        boolean result = comandas.remove(c);
        System.out.println(comandas.remove(c));
        System.out.println(comandas);
        if (result) {
            atualizarArquivo(comandas);
            return true;
        } else {
            return false;
        }
    }

    /**
     * @param id número do id da comanda que será buscado na lista. Antes de
     * buscar, é verificado se a comanda existe. Caso não exista é retornado
     * NULL.
     * @return A comanda desejada.
     */
    
    @Override
    public Comanda buscar(String id) throws IOException, FileNotFoundException, 
            ClassNotFoundException {
        
        List <Comanda> comandas = listar();
        
        for (Comanda comanda : comandas) {
            if (id.equals(comanda.getId())) {
                return comanda;
            }
        }
        return null;
    }

    /**
     * @param c elemento com tipo Comanda que será atualizada na lista. Antes de
     * atualizar,é feita uma busca pelo id para encontrar a comanda que se
     * deseja modificar. Caso a comanda não seja encontrada é retornado FALSE.
     * @return A confirmação da atualização.
     */
    @Override
    public boolean atualizar(Comanda c) throws IOException, FileNotFoundException, 
            ClassNotFoundException {
        
        List <Comanda> comandas = listar();
        
        for (int i = 0; i < comandas.size(); i++) {
            if (comandas.get(i).getId().equals(c.getId())) {
                comandas.set(i, c);
                atualizarArquivo(comandas);
                return true;
            }
        }
        return false;
    }

    /**
     * @return Todas as comandas da lista.
     */
    @Override
    public List<Comanda> listar() throws FileNotFoundException, IOException, 
            ClassNotFoundException {
        
        if(file.length() > 0){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            
            return (List<Comanda>) in.readObject();
            
        } else {
            return new ArrayList<>();
        }
    }

    
    /**
     * @param id número do id da comanda que deseja fechar, antes de fechar a
     * comanda, é realizada a busca da comanda utilizando o metodo: buscar,
     * implementado anteriormente.
     * @return A confirmação do fechamento e o histórico de comandas fechadas.
     */
    public boolean fecharComanda(String id) throws IOException, FileNotFoundException, 
            ClassNotFoundException {
        
        Comanda comanda = buscar(id);
        if (comanda != null) {
            comanda.setStatus("FECHADA");
            return true;
        }
        return false;
    }

    private void atualizarArquivo(List<Comanda> comandas) throws FileNotFoundException, 
            IOException {
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

        out.writeObject(comandas);
        out.close();
    }
}
