package br.com.design.patterns.imposto;

import br.com.design.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public interface Imposto {
    public BigDecimal calcular(Orcamento orcamento);

}
