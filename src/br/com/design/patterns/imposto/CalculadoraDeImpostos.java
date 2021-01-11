package br.com.design.patterns.imposto;

import br.com.design.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

import static br.com.design.patterns.imposto.TipoImposto.ICMS;
import static br.com.design.patterns.imposto.TipoImposto.ISS;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, TipoImposto tipoImposto) {
        switch (tipoImposto) {
            case ICMS:
                return orcamento
                        .getValor()
                        .multiply(new
                                BigDecimal("0.1")
                        );
            case ISS:
                return orcamento
                        .getValor()
                        .multiply(new
                                BigDecimal("0.6")
                        );
            default:
                return BigDecimal.ZERO;
        }


    }
}
