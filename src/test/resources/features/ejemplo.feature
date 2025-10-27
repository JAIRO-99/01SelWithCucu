Feature: Ejemplo

  Scenario: Ejemplo 1
    Given Navego a la página "https://www.google.com/"
    When Obtengo la url con el driver
    Then Verifico la url obtenida sea igual a la cual se navegó