# Catalisa-Mod05_Exerc_Spring_AgendaContatos
Esta atividade tem  por objetivo, fixar aprendizado básico no uso do Spring framework  para tarefas Java

Para este projeto, fiz uso de um gerenciador de banco de dados, o Docker, incializando um banco de dados PostgresSQL na maquina local;
Também utilizei apenas como auxilo do PGadmin para gerenciar as tabelas dentro do banco de dados;
Iniciei com criação do projeto com a ferramenta Spring Initializr fazendo a modelagem Sping com as dependencias Lombok, Spring Data JPA, Spring Web e PostgresSQL.
  *modelagem entenda-se: 
        a-tipo projeto: Maven project
        b-linguagem utilizada: Java
        c-Spring Boot: 2.7.2
        d-Dados do projeto (Projeto Metadata)
        e-Packaging: Jar
        f-Versao Java: versao 11
        g-Dependencias utilizadas: Lombok, Spring Data JPA, Spring Web e PostgresSQL

Em seguida, com apoio da IDEA IntelliJ, abri o projeto em pasta arquivo local para utilizar a ferramenta IntelliJ para codar
Passos seguintes:

        a. Criar os Diretorios: controller, model, repository, service;
        b. criar classes Java Class nos Diretorios e Class Java Interface para a classe repository com extensão dela para frame JPA Spring;
        c. configuração da conexão entre projeto no IntelliJ com o BD no Docker na pasta Resources, aquivo application.properties;
        d. testar conexão pela classe main e checagem das dependecias baixadas se tudo ok;
        e. iniciei a codação das classes iniciando pelo criaçaõ dos metodos na ordem:
            -primeiramente para dar forma a tabela no BD do servidor Tomcat via classe model no intelliJ, com anotações Lombok @Getter, @Setter, @AllArgsContructor,@NoArgsContructor,@Entity,@Table
            -em seguida classe interface repository com extensão para frame JPA, e anotação @RestController para indicar objetivo da classe
            -em seguida classe Controller inserindo anotação @RestController para indicar objetivo da classe, para criar os metodos para requisições do tipo Get, Post, Put e Delete,
              usei anotações para cada tipo de requisção: @GetMapping, @PostMapping, @PutMapping, @DeleteMapping; associado com argumento "path" para direcionar caminho (url) do BD
              também usei @Autowired para obter relacionamento com a classe Service.
            -em seguida classe Service para receber do Controller as requisiçoes e executar metodos correspondentes, antes tendo que fazer as anotações @service e @Autowired com classe repository,
            
* para obter relacionamentos entre as classes, utilizei anotação @Autowired para relacionamento entre classe Controller e Service, e entre Service e repository.
* alem de anotações dentro de metodos em que o codigo (variavel) mudaria conforme digitação de entrada, do tipo @RequestBody para receber exata descrição de campos da Tabela
* os metodos estao interdependentes porque cada metodo leva assinatura ou como parametro, a Classe a qual esta relacionando responsabilidade de execução; assim, como retorno na classe Controller são evocados os metodos criados na na pasta service

Por fim, usei a plataforma Postman criando uma nova Colletion e fazendo adição de requisição dos tipos solicitados na classe controller no IntelliJ
Em seguida, após ter  criado, executado, testado, aprovado no Postman, subi projeto para GIT fazendo metodo de conexação local para remoto
        git init
        git add Readme.md
        git branch -M main (para caso branch diferente do remoto e local)
        git add .
        git commit -m "escrever submissão)
        git remote add origin "endereço do repositorio GitHub"
        git push -u origin main
        *precisei usar o comando git push -f origin main para poder subir projeto local; problema conflito pois no remoto havia arquivo README.MD criado e na pasta local nao tinha
        
        também tive problema com erro de execução 405 Method Not Allowed quando um website fora do ar, ou links quebrando; especialmente com resposta HTTP onde a pagina nao estava sendo encontrada no servidor tomcat; problema estava numa escrita do metodo, faltou um simples "s".            
        

----------------------------------------------------------------------------------------------------------------

descrição da atividade:

LISTA DE EXERCÍCIO SPRING - Entregar
Desenvolver uma API REST desenvolvida em JAVA e utilizando o framework Spring uma aplicação que possua endpoints de leitura, escrita, atualização e deleção de contatos de uma agenda telefônica.

Funcionalidades:
1- Exibir de todos os contatos
2- Exibir de um contato específico
3- Cadastro de um novo contato
4- Update de um contato
5- Deleção de um contato

Especificações:
1- Um contato possui um nome e um número de telefone
