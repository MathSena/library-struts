
# Sistema de Biblioteca com Struts

Este projeto faz parte dos estudos sobre a tecnologia **Struts 2** e foi desenvolvido como trabalho acadêmico/profissional para entender e aplicar os conceitos dessa estrutura. O sistema simula um ambiente de biblioteca onde é possível listar livros, emprestar e devolver exemplares, utilizando a combinação de JSP, Struts 2, Servlets e Bootstrap para a interface.

## Tecnologias Utilizadas

- **Apache Struts 2** – Framework MVC para aplicações Java
- **JSP** – JavaServer Pages para a camada de visão
- **Servlet API** – Para processamento de imagens (ImageServlet)
- **Bootstrap** – Framework CSS para uma interface moderna e responsiva
- **Tomcat 9** – Servidor de aplicações para executar a aplicação

## Funcionalidades

- **Listagem de Livros:** Exibe os livros disponíveis com informações como ID, título, imagem e status (disponível ou emprestado).
- **Emprestar Livro:** Permite emprestar um livro, alterando seu status para emprestado.
- **Devolver Livro:** Permite devolver um livro, alterando seu status para disponível.
- **Exibição de Imagens:** Utiliza um servlet para servir as imagens dos livros a partir de um diretório protegido.

## Como Executar

### Pré-requisitos

- **Java JDK** instalado
- **Apache Tomcat 9** instalado e configurado
- Um **IDE** compatível com desenvolvimento web em Java (por exemplo, Eclipse, IntelliJ IDEA) ou um editor de sua preferência

### Passos para Execução

1. **Clone o repositório:**

   
   git clone https://seu-repositorio-url.git
   

2. **Importe o projeto na sua IDE:**

   - Se estiver usando o Eclipse, importe como um Dynamic Web Project.
   - Caso o projeto utilize Maven, importe como um Maven Project.

3. **Configure o Tomcat 9:**

   - Adicione o Tomcat 9 como servidor na sua IDE ou copie o arquivo WAR gerado para o diretório `webapps` do Tomcat 9.

4. **Compile e execute o projeto:**

   - Na sua IDE, inicie o servidor Tomcat.
   - Se estiver usando o terminal, navegue até a pasta do Tomcat e inicie o servidor (por exemplo, utilizando o script `startup.sh` ou `startup.bat`).

5. **Acesse a aplicação:**

   Abra o navegador e acesse:

   
   http://localhost:8080/nome-do-contexto
   

   Onde `nome-do-contexto` é o nome do seu projeto (geralmente definido no arquivo `web.xml` ou pelo nome da pasta/WAR).

## Estrutura do Projeto

- `src/`: Código-fonte Java, incluindo as classes Action e Servlets.
- `WebContent/` ou `src/main/webapp/`: Arquivos JSP, WEB-INF, e recursos estáticos (CSS, imagens, etc.).
- `WEB-INF/struts.xml`: Configuração das ações do Struts.
- `WEB-INF/web.xml`: Configuração do servlet e filtros, incluindo o mapeamento do Struts 2 e do ImageServlet.
- `css/style.css`: Arquivo de estilos customizados, complementando o Bootstrap.

## Considerações Finais

Este projeto foi desenvolvido com foco em aprendizagem e prática com Struts 2 e tecnologias web em Java. Sinta-se à vontade para aprimorar o código, expandir funcionalidades ou adaptar a interface conforme as necessidades do seu trabalho.
