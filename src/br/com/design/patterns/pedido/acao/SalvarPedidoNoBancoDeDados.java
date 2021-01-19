package br.com.design.patterns.pedido.acao;

import br.com.design.patterns.pedido.Pedido;

public class SalvarPedidoNoBancoDeDados {
    public void executar(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados !");
    }
}
