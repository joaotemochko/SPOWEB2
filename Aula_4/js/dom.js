// O método mais versátil e recomendado atualmente:
const titulo = document.querySelector('h1'); // Pela tag
const botao = document.querySelector('.btn-salvar'); // Pela classe
const container = document.getElementById('conteudoPrincipal'); // Pelo ID

// Para selecionar múltiplos elementos:
const itensLista = document.querySelectorAll('li');

// Alterando o texto
titulo.textContent = "Olá, Turma!";
titulo.innerHTML = "Olá, <strong>Turma!</strong>";

// Alterando estilos inline
titulo.style.color = "blue";
titulo.style.fontSize = "2rem";

// Manipulando classes CSS (melhor prática)
titulo.classList.add('destaque');
titulo.classList.remove('oculto');