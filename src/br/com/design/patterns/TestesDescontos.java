package br.com.design.patterns;

import br.com.design.patterns.desconto.CalculadoraDeDescontos;
import br.com.design.patterns.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {

    public static void main(String[] args) {

        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);
        Orcamento terceiro = new Orcamento(new BigDecimal("100"), 1);

        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();
        System.out.println(calculadoraDeDescontos.calcular(primeiro));
        System.out.println(calculadoraDeDescontos.calcular(segundo));
        System.out.println(calculadoraDeDescontos.calcular(terceiro));

    }


}
