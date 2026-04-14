package com.example.primeiraapi.controller;

// Classe que representa um produto
public class Produto {
   // Atributos do produto
    private Long id;
    private String nome;
    private double preco;
 // Construtor: usado para criar um objeto Produto já com valores
   public Produto(Long id, String nome, double preco) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    // Método getter para o atributo id
    public Long getId() {
            return id;
        }
        // Método getter para o atributo nome
    public String getNome() {
            return nome;
        }
    // Método getter para o atributo preco
    public double getPreco() {
            return preco;
        }
}
