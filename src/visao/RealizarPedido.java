package visao;

import dao.ComandaDao;
import dao.ProdutoDao;
import java.util.Scanner;
import modelo.Comanda;
import modelo.Funcionario;
import modelo.LoginFuncionario;
import modelo.Pedido;
import modelo.Produto;

/**
 *
 * @author fernanda
 */
public class RealizarPedido {

    public static void run(Funcionario funcionario, ComandaDao cadastro) {

        Scanner scanner = new Scanner(System.in);

        ProdutoDao produtos = new ProdutoDao();

        System.out.print("ID DA COMANDA: ");
        Integer idComanda = scanner.nextInt();

        Comanda comanda = cadastro.buscar(idComanda);

        if (comanda != null && comanda.getStatus().equals(Comanda.ABERTA)) {

            ListarProdutos.run(produtos);

            System.out.print("ID DO PRODUTO: ");
            Integer idProduto = scanner.nextInt();

            Produto produto = produtos.buscar(idProduto);

            if (produto != null) {
                System.out.println("QUANTIDADE DESEJADA");
                Integer quantidade = scanner.nextInt();

                System.out.println("ID DO PEDIDO");
                Integer idPedido = scanner.nextInt();

                System.out.println("OBSERVAÇÃO: ");
                String observacao = scanner.nextLine();

                if (quantidade > 0) {
                    Pedido pedido = new Pedido(idPedido, observacao, quantidade,
                            produto, funcionario, comanda);

                    comanda.realizarPedido(pedido);
                } else {
                    System.out.println("QUANTIDADE INVÁLIDA");
                }
            } else {
                System.out.println("PRODUTO NÃO ENCONTRADO");
            }

        } else {
            System.out.println("COMANDA NÃO ENCONTRADA");
        }
    }
}
