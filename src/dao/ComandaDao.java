package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Comanda;

/**
 * Classe que implementa um DAO (Data Acess Object) por meio de uma lista. Essa
 * implementação permite a realização das operações do CRUD (CREAT-READ-UPDATE-
 * DELETE).
 *
 * @author fernanda
 * @see java.util.Lista
 * @see java.util.ArrayLista
 */
public class ComandaDao implements DaoGeneric<Comanda> {

    private List<Comanda> comandas;

    /**
     * Cria um novo Dao com uma lista vazia
     */
    public ComandaDao() {
        comandas = new ArrayList<>();
    }

    /**
     * @param c elemento com tipo Comanda que será salvo na lista. Antes de
     * salvar a comanda, é verificado se ela já existe, comparando o id. Caso
     * exista é retornado FALSE.
     * @return A confirmação da inserção.
     */
    @Override
    public boolean salvar(Comanda c) {
        for (Comanda comanda : comandas) {
            if (c.equals(comanda)) {
                return false;
            }
        }
        return comandas.add(c);
    }

    /**
     * @param c elemento com tipo Comanda que será deletado da lista.
     * @return A confirmação da exclusão.
     */
    @Override
    public boolean deletar(Comanda c) {
        return comandas.remove(c);
    }

    /**
     * @param id número do id da comanda que será buscado na lista. Antes de
     * buscar, é verificado se a comanda existe. Caso não exista é retornado
     * NULL.
     * @return A comanda desejada.
     */
    @Override
    public Comanda buscar(int id) {
        for (Comanda comanda : comandas) {
            if (comanda.getId() == id) {
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
    public boolean atualizar(Comanda c) {
        for (int i = 0; i < comandas.size(); i++) {
            if (comandas.get(i).equals(c)) {
                comandas.set(i, c);
                return true;
            }
        }
        return false;
    }

    /**
     * @return Todas as comandas da lista.
     */
    @Override
    public List<Comanda> listar() {
        return comandas;
    }

    /**
     * @param status nome do status que se deseja agrupar as comandas. Para
     * fazer esse agrupamento/seleção/lista, é criada uma nova lista do tipo
     * Comanda que irá armazenar todas as comandas com o status desejado,
     * selecionadas da lista que contém todas as comandas do sistema.
     * @return Lista de comandas com o status desejado.
     */
    public List<Comanda> listarPeloStatus(String status) {
        List<Comanda> resultado = new ArrayList<>();
        for (Comanda comanda : comandas) {
            if (comanda.getStatus() == status) {
                resultado.add(comanda);
            }
        }

        return resultado;
    }

    /**
     * @param id número do id da comanda que deseja fechar, antes de fechar a
     * comanda, é realizada a busca da comanda utilizando o metodo: buscar,
     * implementado anteriormente.
     * @return A confirmação do fechamento e o histórico de comandas fechadas.
     */
    public boolean fecharComanda(int id) {
        Comanda comanda = buscar(id);
        if (comanda != null) {
            comanda.setStatus("FECHADA");
            return true;
        }
        return false;
    }
}
