Feature: Login Comsatel



  Scenario: Logueate Comsatel

    Given Ingresar a la página de login de Comsatel "https://oauth2.dev.comsatel.com.pe/realms/Apps/protocol/openid-connect/auth?client_id=cl2-svrbasico&redirect_uri=https%3A%2F%2Fcl2webportal.qa.comsatel.com.pe%2Fhome%2Funidad%2Fmapa&state=dd6c1730-b8b4-44b6-8d9c-c4ab63357b51&response_mode=fragment&response_type=code&scope=openid&nonce=825856c0-fec1-4374-888a-e841efa4458e&code_challenge=rHW0XKvM-GZqRS-d0zS9b9fkVcPCEa7TRKQSMjCJUF4&code_challenge_method=S256"
    When Ingreso a las credenciales con usuario "qacomsatel@gmail.com" y contraseña "welcome1"
    Then login exitoso

