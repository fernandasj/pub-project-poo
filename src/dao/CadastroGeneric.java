package dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fernanda
 */
public class CadastroGeneric <T>{
    private List<T> elementos;
    
    public CadastroGeneric(){
        elementos = new ArrayList<>();
    }
    
    public boolean salvar(T e){
        for(T elemento : elementos){
            if(e == elemento){
                return false;
            }
        }
        return elementos.add(e);    
    }
    
    public boolean deletar(T e){
        return elementos.remove(e);
    }
}
