package com.example.primeiraapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

public class ListaProdutoController {
    // Mapeia requisições GET para a rota "/produtos"
    @GetMapping("/produtos")
    public List<Produto> listarProdutos() {

        // Retorna uma lista com vários produtos
        // O Spring Boot converte a lista em JSON automaticamente
        return List.of(
            new Produto(1L, "Notebook", 3500.00),
            new Produto(2L, "Mouse", 80.00),
            new Produto(3L, "Teclado", 150.00)
        );
    }

}
