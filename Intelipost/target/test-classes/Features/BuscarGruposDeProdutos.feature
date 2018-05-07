Feature: Buscar grupos de produtos

  Scenario: Buscar grupo de produtos
    When Enviar uma requisição para a API de grupos "https://api.intelipost.com.br/api/v1/sku_groups"
    Then É retornado os dados com os grupos