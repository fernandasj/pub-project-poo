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
import modelo.Funcionario;

/**
 * Classe que implementa um DAO (Data Acess Object) por meio de uma lista. Essa
 * implementação permite a realização das operações do CRUD (CREAT-READ-UPDATE-
 * DELETE).
 *
 * @author fernanda
 * @see java.util.List
 * @see java.util.ArrayList
 */
public class FuncionarioDao implements DaoGeneric<Funcionario> {
    
    private File file;
    
    /**
     * Cria um novo Dao com uma lista vazia
     */
    
    public FuncionarioDao() throws IOException{
        file = new File("Arquivos/funcionarios.bin");
        
        if (!file.exists()) {
            file.createNewFile();
        }
    }
    
    /**
     * @param f elemento com tipo Funcionario que será salvo na lista. Antes de
     * salvar o funcionario, é verificado se ele já existe, comparando o cpf. Caso
     * exista é retornado FALSE.
     * @return A confirmação da inserção.
     */
    @Override
    public boolean salvar(Funcionario f) throws IOException, ClassNotFoundException, 
            FileNotFoundException {
        
        if(buscar(f.getCpf()) == null){
            List <Funcionario> funcionarios = listar();
            
            if(funcionarios.add(f)){
                atualizarArquivo(funcionarios);
                return true;
            } else{
                return false;
            }
        } else {
            return false;
        }
    }

    /**
     * @param f elemento com tipo Funcionario que será deletado da lista.
     * @return A confirmação da exclusão.
     */
    @Override
    public boolean deletar(Funcionario f) throws IOException, ClassNotFoundException, 
            FileNotFoundException {
        
        List <Funcionario> funcionarios = listar();
        
        if(funcionarios.remove(f)){
            atualizarArquivo(funcionarios);
            return true;
        } else{
            return false;
        }
    }

    /**
     * @param cpf número do cpf do funcionario que será buscado na lista. Antes de
     * buscar, é verificado se o funcionario existe. Caso não exista é retornado
     * NULL.
     * @return O funcionario desejado.
     */
    @Override
    public Funcionario buscar(String cpf) throws IOException, ClassNotFoundException, 
            FileNotFoundException {
        
        List <Funcionario> funcionarios = listar();
        
        for (Funcionario funcionario : funcionarios) {
            if (cpf.equals(funcionario.getCpf())) {
                return funcionario;
            }
        }
        return null;
    }

     /**
     * @param funcionario elemento com tipo Funcionario que será atualizado na lista. 
     * Antes de atualizar,é feita uma busca pelo id para encontrar o funcionario que se
     * deseja modificar. Caso o funcionario não seja encontrada é retornado FALSE.
     * @return A confirmação da atualização.
     */
    @Override
    public boolean atualizar(Funcionario funcionario) throws IOException, 
            ClassNotFoundException, FileNotFoundException {
        
        List <Funcionario> funcionarios = listar();
        
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getCpf().equals(funcionario.getCpf())) {
                funcionarios.set(i, funcionario);
                atualizarArquivo(funcionarios);
                return true;
            }
        }
        return false;
    }

    /**
     * @return Todas as comandas da lista.
     */
    @Override
    public List<Funcionario> listar() throws IOException, ClassNotFoundException, 
            FileNotFoundException {
        
        if(file.length() > 0){
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(file));
            
            return (List<Funcionario>) in.readObject();
            
        } else {
            return new ArrayList<>();
        }
    }

    private void atualizarArquivo(List<Funcionario> funcionarios) throws 
            FileNotFoundException, IOException {
        
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file));

        out.writeObject(funcionarios);
        out.close();
    
    }
}
