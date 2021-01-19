package br.com.design.patterns;

import br.com.design.patterns.pedido.GeraPedido;

import java.math.BigDecimal;

public class TestesPedidos {
    public static void main(String[] args) {

        String cliente = args[0];
        BigDecimal valorOrcarmento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeraPedido geraPedido = new GeraPedido(cliente, valorOrcarmento, quantidadeItens);
        geraPedido.executa();

    }
}