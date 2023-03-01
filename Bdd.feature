#Author: wesley amorim

@teste
Feature: correios
  dado que eu esteja no site dos correios

  @teste1
  Scenario: acessar a barra de busca do site correios
    Given que eu esteja no site dos correios
    And clico em busca de cep
    When digito o cep e aperto enter
    Then sou redirecionado para o resultado de busca

  @teste2
  Scenario: acessar a barra de busca do site correios
    Given que eu esteja no site dos correios
    And clico em busca de cep
    When digito o cep com uma letra e aperto enter
    But dados não encontrado