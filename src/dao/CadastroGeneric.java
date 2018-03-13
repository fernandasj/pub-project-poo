package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Comanda;

/**
 *
 * @author fernanda
 */
public class CadastroGeneric implements DaoGeneric <Comanda>{
    private List<Comanda> comandas;
    
    public CadastroGeneric(){
        comandas = new ArrayList<>();
    }
    
    @Override
    public boolean salvar(Comanda c){
        for(Comanda comanda : comandas){
            if (c.equals(comanda)){
                return false;
            }
        }
        return comandas.add(c);    
    }
    
    @Override
    public boolean deletar(Comanda c){
        return comandas.remove(c);
    }
    
    
    @Override
    public Comanda buscar(int id){
        for(Comanda comanda : comandas){
            if (comanda.getId() == id){
                return comanda;
            }
        }
        return null;    
    }
    
    @Override
    public boolean atualizar(Comanda c) {
        for(int i=0; i < comandas.size(); i++){
            if(comandas.get(i).equals(c)){
                comandas.set(i, c);
                return true;
            }
        }
        return false;
    }
    
    public List<Comanda> listar() {
        return comandas;
    }
    
    public List<Comanda> listarPeloStatus(String status) {
        List<Comanda> resultado = new ArrayList<>();
        for (Comanda comanda : comandas) {
            if (comanda.getStatus() == status) {
                resultado.add(comanda);
            }
        }
        
        return resultado;
    }
}
