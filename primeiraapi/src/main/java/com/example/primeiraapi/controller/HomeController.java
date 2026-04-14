package com.example.primeiraapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Indica que esta classe será um controller REST
// Ou seja, responderá requisições HTTP e retornará dados
@RestController
public class HomeController {
    // Mapeia requisições GET para a rota "/"
    @GetMapping("/")
    public String inicio() {
        // Retorna uma mensagem em texto simples
        return "API funcionando com Spring Boot!";
    }

    // Mapeia requisições GET para a rota "/mensagem"
    @GetMapping("/mensagem")
    public String mensagem() {

        // Retorna uma mensagem de boas-vindas
        return "Bem-vindos à aula prática de Spring Boot!";
    }

}

