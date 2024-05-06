Feature: Typicode

  @GET
  Scenario: Validar chamada GET
    Given que efetuo consulta de usuarios total
    When devo obter o retorno 200
    Then verifico name do usuario 10

  @POST
  Scenario: Validar chamada POST
    Given que efetuo post
    When devo obter o retorno 201
    Then verifico o id retornado

  @PUT
  Scenario: Validar chamada PUT
    Given que efetuo PUT
    When devo obter o retorno 200
    Then verifico o id 1 retornado

  @DELETE
  Scenario: Validar chamada DELETE
    Given que efetuo DELETE
    When devo obter o retorno 200
    Then retorno deve ser vazio
