Feature: Alertas sin agrupar cargue periodico

  Background: Instruccione para ejecutar las alertas sin agrupar:
    *El archivo web.config debe tener habilitada la opcion EjecutarVerificacionAlertasSinAgrupar
    *Los archivos de carga deben tener la información que genere la alerta configurada

  Scenario: Ejecutar las alertas sin agrupar por medio del proceso automatico
    Given El administrador ingresa en Administracion/proceso automatico
    When Ejecutar el proceso automatico
    Then Debe ver las alertas sin agrupar generadas