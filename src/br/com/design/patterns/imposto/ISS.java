package br.com.design.patterns.imposto;

import br.com.design.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS implements Imposto {

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento
                .getValor()
                .multiply(new
                        BigDecimal("0.1")
                );
    }
}
