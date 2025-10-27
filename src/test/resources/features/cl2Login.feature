Feature: Login Comsatel

  Scenario: Login Comsatel

    Given Ingresar a la página de login de Comsatel
    When Ingreso a las credenciales cone usuario "qacomsatel@gmail.com" y contraseña "welcome1"
    Then login exitoso

