package br.com.design.patterns.pedido;

import br.com.design.patterns.orcamento.Orcamento;
import br.com.design.patterns.pedido.acao.AcaoAposGerarPedido;
import br.com.design.patterns.pedido.acao.EnviarEmailPedido;
import br.com.design.patterns.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void execute(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        acoes.forEach(acao -> acao.executarAcao(pedido));


    }
}
