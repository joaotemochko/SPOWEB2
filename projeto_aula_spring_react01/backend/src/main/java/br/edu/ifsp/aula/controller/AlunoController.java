package br.edu.ifsp.aula.controller;

import br.edu.ifsp.aula.model.Aluno;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/alunos")
@CrossOrigin(origins = "*") // Fundamental: Permite o React acessar a API sem bloqueio de CORS
public class AlunoController {

    private List<Aluno> alunos = new ArrayList<>();

    public AlunoController() {
        // Mock de dados em memória para manter o projeto simples para a aula
        alunos.add(new Aluno(1L, "Ana Silva", "Técnico em Informática"));
        alunos.add(new Aluno(2L, "Carlos Souza", "Engenharia Elétrica"));
        alunos.add(new Aluno(3L, "Maria Fernanda", "Análise e Desenvolvimento de Sistemas"));
    }

    @GetMapping
    public List<Aluno> listarTodos() {
        return alunos;
    }
}
