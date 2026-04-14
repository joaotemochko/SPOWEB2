package com.example.primeiraapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Indica que esta classe é um controller REST
@RestController
public class ProdutoController {

    // Mapeia requisições GET para a rota "/produto"
    @GetMapping("/produto")
    public Produto produto() {

        // Cria e retorna um objeto Produto
        // O Spring Boot converte esse objeto automaticamente em JSON
        return new Produto(1L, "Notebook", 3500.00);
    }
}

