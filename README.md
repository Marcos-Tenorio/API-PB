# Projeto Automação de API usando RestAssured e Cucumber
API https://jsonplaceholder.typicode.com/

Cenarios:

1 - GET no endpoint /users validando nome de usuario 10;
2 - POST no endpoint /posts validando retorno de id 101;
3 - PUT no endpoint /posts/1 validando retorno de apenas 1 id;
4 - DELETE no endpoint /posts/1 validando retorno de body vazio 

## Relatório de execução dos testes 
Utilizando ExtentReport para gerar relatorio apos execucao de teste. 
resultado fica armazenado no path target > cucumber-reports.

### Executar
Utilizado JDK 11
- Definir como projeto Maven 
- no terminal do maven de o comando mvn clean install
- Baixe fonte e documentacao na janela de comandos do Maven
- src > test > java > runners execute a classe RunnerTypicode
