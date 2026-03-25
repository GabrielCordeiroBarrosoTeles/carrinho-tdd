package com.atv.carrinho;

/**
 * Soma os valores dos itens. Se o total for maior que 200, aplica 10% de desconto.
 */
public final class Carrinho {

    private static final double LIMITE_DESCONTO = 200.0;
    private static final double FATOR_COM_DESCONTO = 0.9;

    private Carrinho() {
    }

    public static double calcularTotal(double... valoresItens) {
        double soma = 0;
        for (double v : valoresItens) {
            soma += v;
        }
        if (soma > LIMITE_DESCONTO) {
            return soma * FATOR_COM_DESCONTO;
        }
        return soma;
    }
}
