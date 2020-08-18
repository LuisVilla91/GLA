Feature: LoginGLA

  Scenario Outline: Login Exitoso
    Given El administrador abre la aplicacion
    When Ingreso <usuario> y <contrasena>
    Then Debo ver mi nombre de usuario <nombre>
    Examples:
      | usuario | contrasena || nombre |
      | admin | admin | | admin|





