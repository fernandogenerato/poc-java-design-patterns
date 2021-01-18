package br.com.design.patterns.desconto;

import br.com.design.patterns.orcamento.Orcamento;

import java.math.BigDecimal;


public class DescontoParaOrcamentoComValorMaiorQueQuinhentos extends Desconto {

    public DescontoParaOrcamentoComValorMaiorQueQuinhentos(Desconto proximo) {
        super(proximo);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

}
