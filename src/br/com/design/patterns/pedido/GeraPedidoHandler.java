package br.com.design.patterns.pedido;

import br.com.design.patterns.orcamento.Orcamento;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    //construtor com injecao de dependencias : repository, service, etc...

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no Banco de Dados");
        System.out.println("Enviar email com dados do novo pedido");

    }
}
