Feature: Consultar métodos de envios

  Scenario: Consultar os métodos de envio
    When Enviar requisição para a API consulta de métodos de postagem "https://api.intelipost.com.br/api/v1/info"
    Then É retornado os dados com os métodos de envio