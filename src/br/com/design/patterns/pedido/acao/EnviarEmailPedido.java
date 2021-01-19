package br.com.design.patterns.pedido.acao;

import br.com.design.patterns.pedido.Pedido;

public class EnviarEmailPedido {
    public void executar(Pedido pedido){
        System.out.println("Enviando email com dados do pedido!");
    }
}
