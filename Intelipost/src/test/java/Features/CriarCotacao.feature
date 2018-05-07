Feature: Criar cotação

  Scenario: Criar cotação por produto
    When Enviar uma requisição para a API "https://api.intelipost.com.br/api/v1/quote_by_product", informando os parametros necessários
    Then É retornado os dados cotação