package br.com.design.patterns.desconto;

import br.com.design.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    public BigDecimal calcular(Orcamento orcamento) {
       return BigDecimal.ZERO;
    }


}
