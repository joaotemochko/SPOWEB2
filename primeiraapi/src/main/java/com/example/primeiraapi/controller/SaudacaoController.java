package com.example.primeiraapi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Indica que esta classe é um controller REST
@RestController
public class SaudacaoController {
    // Mapeia requisições GET para a rota "/saudacao"
    @GetMapping("/saudacao")
    public String saudacao(
        // Captura o parâmetro "nome" enviado na URL
        // Se nenhum nome for enviado, usa "Visitante" como valor padrão
        @RequestParam(defaultValue = "Visitante") String nome
    ) {
        // Monta e retorna uma saudação personalizada
        return "Olá, " + nome + "! Seja bem-vindo ao Spring Boot.";
    }
}

