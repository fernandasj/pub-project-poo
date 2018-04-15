package dao;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

/**
 * Interface genérica para a criação de DAO (Data Acess Object), contendo operações 
 * básicas de um CRUD (CREAT-READ-UPDATE-DELETE).
 * 
 * @author fernanda
 * @see java.util.List
 */

public interface DaoGeneric <T> {
    
   /**
    * @param e elemento com tipo T que será salvo no DAO. Antes de salvar o elemento,
    * é verificado se ele já existe, comparando o id. Caso exista é retornado FALSE.
    * @return A confirmação da inserção.
    */
    
   public boolean salvar(T e) throws IOException, ClassNotFoundException, 
           FileNotFoundException;
   
   /**
    * @param e elemento com tipo T que será deletado no DAO. 
    * @return A confirmação da exclusão.
    */

   public boolean deletar(T e) throws IOException, ClassNotFoundException, 
           FileNotFoundException;
   
   /**
    * @param id número do id do elemento que será buscado no DAO. Antes de buscar,
    * é verificado se o elemento existe. Caso não exista é retornado NULL.
    * @return O elemento desejado.
    */

   public  T buscar(String id) throws IOException, ClassNotFoundException, 
           FileNotFoundException;
   
   /**
    * @param elemento elemento com tipo T que será atualizado no DAO. Antes de 
    * atualizar, é feita uma busca pelo id para encontrar o elemento a ser 
    * atualizado. Caso o elemento não seja encontrado é retornado FALSE.
    * @return A confirmação da atualização.
    */

   public boolean atualizar(T elemento) throws IOException, ClassNotFoundException, 
           FileNotFoundException;
   
   /**
    * @return Todos os elementos de uma lista tipo T.
    */
    
   public List<T> listar() throws IOException, ClassNotFoundException, 
           FileNotFoundException;   
}
