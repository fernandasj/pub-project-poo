package visao;

import java.time.LocalDate;
import java.time.LocalDateTime;
import modelo.Comanda;
import modelo.Funcionario;
import modelo.Pedido;
import modelo.Produto;

/**
 *
 * @author fernanda
 */
public class NewClass {
    public static void main(String[] args) {
        LocalDate data = LocalDate.now();
        LocalDateTime data2 = LocalDateTime.now();
        
        Funcionario F1 = new Funcionario(900f, "Feminino", data, "skdjsd", "rua", 
                "bairro", "cidade", "cpf", "Maria", "telefone", data);
        
        Produto P1 = new Produto(1, "descricao", 12f, "Fava");
        Produto P2= new Produto(1, "descricao", 22f, "Carne");
        
        Comanda C1 = new Comanda(2, 1, "status", 0);
        
        Pedido ped1 = new Pedido(1, data2 , "observacao", "status", 1, P1, F1, C1);
        Pedido ped2 = new Pedido(1, data2 , "observacao", "status", 2, P1, F1, C1);
        Pedido ped3 = new Pedido(1, data2 , "observacao", "status", 2, P2, F1, C1);
        
               
        C1.calcularValor(ped3);
        System.out.println(C1.getValor());
        
        P2.setPreco(23);
        System.out.println(C1.getPedidos().get(0).getPrecoProduto());
        System.out.println(C1.getValor());
        
        
    }
}
