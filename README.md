# Teste de API em Java, usando BDD

Para realizar testes na API da Intelipost, foi utilizado a linguagem Java, BDD (Cucumber) e a biblioteca OKHttp para mandar requisições.

Como estou utilizando BDD, resolvi criar meu projeto com a seguinte estrutura de pastas.

Features -> É onde ficaram as features que descrevem os passos do teste.
Steps -> É onde ficaram os passos para automação dos testes.
Pages -> Onde ficaram classes e métodos utilizados nos Steps dos testes, caso estive usando Selenium os objetos da tela poderiam ficar nesta pasta.

Como estou usando Java para testar as APIs,todas as depencias de bibliotecas estão inseridas no arquivo pom.xml.

## Instruções para rodar os testes

Estou usando a IDE Intellij para criar meu projeto e rodar os testes.

Para rodar os testes, basta abrir o projeto no Intellij, ir até a pasta features clicar com o botão direito depois em Run/all features.

Para gerar um relatório dos testes executados, após a execução dos testes, clicar no botão Export Test Results, escolher o formato do arquivo para visualização do report, inserir o local onde deseja salvar o arquivo e clicar em OK para gerar o arquivo.

## Informações importantes

Como é apenas uma demonstração de como automatizar, desenvolvi apenas alguns casos de testes, porém em um projeto real a quantidade de casos de testes será bem maior e com maior cobertura.

Conforme citei acima, como é apenas uma demonstração algumas variaveis eu deixei fixa, porém em um projeto real podemos deixar dinâmica.



