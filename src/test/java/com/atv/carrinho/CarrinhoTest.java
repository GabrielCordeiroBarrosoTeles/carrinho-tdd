package com.atv.carrinho;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarrinhoTest {

    @Test
    void casoSimples_somaSemDesconto() {
        double total = Carrinho.calcularTotal(50, 50, 50);
        assertEquals(150.0, total, 0.001);
    }

    @Test
    void casoComDesconto_dezPorcentoQuandoMaiorQue200() {
        double total = Carrinho.calcularTotal(100, 100, 50);
        assertEquals(225.0, total, 0.001);
    }
}
