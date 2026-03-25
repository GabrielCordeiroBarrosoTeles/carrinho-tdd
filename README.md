# carrinho-tdd

Projeto simples em Java (Maven + JUnit 5) para exercício de **TDD**: soma os valores do carrinho e aplica **10% de desconto** se o total for **maior que 200**.

## Como rodar os testes

```bash
cd ~/testes/carrinho-tdd && mvn test
```

## Saída dos testes

![Resultado de `mvn test`](docs/captura-mvn-test.png)

## Estrutura

- `src/main/java/.../Carrinho.java` — regra de negócio
- `src/test/java/.../CarrinhoTest.java` — cenários: sem desconto e com desconto
