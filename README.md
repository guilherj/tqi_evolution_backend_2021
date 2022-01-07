<h1 align="center"> Projeto TQI: API para Sistema de Avaliação de Créditos </h1>


<h2 align="center"> ‼️ NÃO PENSE QUE É CAPAZ. SAIBA QUE É ‼️ </h2>

<h2> 📚 Desafio Proposto</h2>

Dado o cenário abaixo, elabore uma sugestão para o back-end necessária para resolver o problema.
Use a criatividade! Você pode explorar aqui todos os seus conhecimentos, demonstrando fluxos, telas, protótipos e/ou codificação.
É importante sabermos por que você decidiu fazer a solução, portanto deixe clara a motivação das suas escolhas.

Uma empresa de empréstimo precisa criar um sistema de análise de crédito para fornecer aos seus clientes as seguintes funcionalidades:

<h3>🔺 i. Cadastro de clientes</h3>
O cliente pode cadastrar: nome, e-mail, CPF, RG, endereço completo, renda e senha.<br><br>
 
 <h3>🔺 ii. Login </h3>
 A autenticação será realizada por e-mail e senha.<br><br>
 
<h3>🔺 iii. Solicitação de empréstimo </h3>
Para solicitar um empréstimo, precisamos do valor do empréstimo, data da primeira parcela e quantidade de parcelas.<br>
O máximo de parcelas será 60 e a data da primeira parcela deve ser no máximo 3 meses após o dia atual.<br><br>

<h3>🔺 iv. Acompanhamento das solicitações de empréstimo </h3>
O cliente pode visualizar a lista de empréstimos solicitados por ele mesmo e também os detalhes de um de seus empréstimos.<br>
Na listagem, devemos retornar no mínimo o código do empréstimo, o valor e a quantidade de parcelas.<br>
No detalhe do empréstimo, devemos retornar: código do empréstimo, valor, quantidade de parcelas, data da primeira parcela, e-mail do cliente e renda do cliente.<br>
    
----
<h2>🛑 Restrição</h2>

<p>
A implementação deve utilizar linguagem Java ou Kotlin.<br>
</p>

----

<h2> 👣 Minha Solução </h2>

<p>
Minha idéia de solução para o desafio proposto foi de desenvolver uma API Rest com conexão com Banco de dados para servir de<br>
Back-End para um site que pode ser desenvolvido pela equipe de Front-End.    
</p>


<h3>🔹 DESENVOLVIMENTO:</h3>

<p>
Eu tentei criar esta API utilizando todo o conhecimento adquirido no bootcamp e em outros conteúdos assistidos anteriormente, utilizando boas práticas de desenvolvimento, programação em camadas, injeção de depenência, invesão de controle, atribuição de responsabilidades as classes e interfaces e etc.
</p>

    
------------

## 🛠️ Técnologias Utilizadas

✅ Java JDK 11 <br>
✅ Spring Boot 2.6.2 <br>
✅ Maven <br>
✅ Banco de Dados H2 <br>
✅ Lombok <br>
✅ Model Mapper <br>
✅ IDE Spring Tool Suite 4 <br>
✅ Postman (Para testes dos endpoints) <br>


------------

<h2> 🧮 FUNCIONALIDADES DA API </h2>

<p>
<h3> 🔸 Cadastrar Cliente</h3>

- **Verbo HTTP:** POST<br>
- **Endpoint:** "/cliente"<br>

<h3> 🔸 Buscar Lista de Cliente</h3> 

- **Verbo HTTP:** GET<br>
- **Endpoint:** "/cliente"<br>

<h3> 🔸 Buscar Cliente por id</h3> 

- **Verbo HTTP:** GET<br>
- **Endpoint:** "/cliente/**id**"<br>

<h3> 🔸 Login </h3> 

- **Verbo HTTP:** GET<br>
- **Endpoint:** "/login"<br>

<h3> 🔸 Cadastrar Novo Empréstimo</h3> 

- **Verbo HTTP:** POST<br>
- **Endpoint:** "/emprestimo"<br>

<h3> 🔸 Buscar Listagem de Empréstimos por id do cliente</h3> 

- **Verbo HTTP:** GET<br>
- **Endpoint:** "emprestimo/listagem/cliente?id=**inserir id do cliente**"<br>

<h3> 🔸 Buscar Empréstimo Detalhado por id</h3> 

- **Verbo HTTP:** GET<br>
- **Endpoint:** "emprestimo/detalhe/**inserir id do emprestimo**"<br>

------------

Desenvolvido por [Guilherme Nascimento](https://www.linkedin.com/in/guilherme-nascimento-27091991/ "Guilherme Nascimento").
