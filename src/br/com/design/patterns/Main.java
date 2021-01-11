package br.com.design.patterns;

import br.com.design.patterns.imposto.CalculadoraDeImpostos;
import br.com.design.patterns.imposto.TipoImposto;
import br.com.design.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, TipoImposto.ICMS));

    }
}
