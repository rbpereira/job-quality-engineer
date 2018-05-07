Feature: Consultar cotação através de API

  Scenario: Consultar Cotação de frete
    When Enviar uma requisição para a API "https://api.intelipost.com.br/api/v1/quote/4206962592"
    Then É retornado os dados do frete