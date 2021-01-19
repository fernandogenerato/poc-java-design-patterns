package br.com.design.patterns;

import br.com.design.patterns.pedido.GeraPedido;
import br.com.design.patterns.pedido.GeraPedidoHandler;
import br.com.design.patterns.pedido.acao.EnviarEmailPedido;
import br.com.design.patterns.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {
    public static void main(String[] args) {

        String cliente = args[0];
        BigDecimal valorOrcarmento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcarmento, quantidadeItens);
        GeraPedidoHandler geraPedidoHandler = new GeraPedidoHandler(Arrays.asList(
                new SalvarPedidoNoBancoDeDados(),
                new EnviarEmailPedido()

        ));
        geraPedidoHandler.execute(geraPedido);
    }
}
