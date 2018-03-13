
package dao;

/**
 *
 * @author fernanda
 */
public interface DaoGeneric <T> {
   public boolean salvar(T e);
   public boolean deletar(T e);
   public  T buscar(int id);
   public boolean atualizar(T elemento);
}
