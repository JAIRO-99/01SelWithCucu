Feature: Ingresar en la página Home



    Background:
      Given que el usuario navega al login de comsatel
      Then el login es exitoso

  Scenario: Ingreso a la pagina home exitoso con grupos

    Given presionamos el boton de menú
    When clicamos el boton en configuraciones
    And clicamos el boton de grupos
    Then nos muestra el título de grupo