package org.example;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class TesteProduto {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto(1000.0, "TV 32'"));
        produtos.add(new Produto(3000.0, "Geladeira"));
        produtos.add(new Produto(1500.0, "Fogão"));
        produtos.add(new Produto(1000.0, "TV 32'"));
        produtos.add(new Produto(2000.0, "Microondas"));
        produtos.add(new Produto(500.0, "Liquidificador"));

        List<Produto>produtosFiltrado = produtos
                .stream()
                .filter(produto -> produto.getPreco() >= 1000.0)
                    //  .map(produto -> produto.getNome().toUpperCase())
                .distinct()
                .toList();


        produtosFiltrado.forEach(p-> System.out.println(p));
    }
}
