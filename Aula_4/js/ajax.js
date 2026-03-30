const cep = '01001000'; // CEP da Praça da Sé, SP
const url = `https://viacep.com.br/ws/${cep}/json/`;

fetch(url)
    .then(response => {
        if (!response.ok) throw new Error("Erro na rede");
        return response.json(); // Converte a resposta para um objeto JavaScript
    })
    .then(dados => {
        console.log("Dados recebidos:", dados);
        // Aqui conectamos com a Aula 1 e 2!
        document.querySelector('#logradouro').textContent = dados.logradouro;
        document.querySelector('#bairro').textContent = dados.bairro;
        document.querySelector('#cidade').textContent = dados.localidade;
    })
    .catch(erro => {
        console.error("Houve um problema com a requisição:", erro);
    });
