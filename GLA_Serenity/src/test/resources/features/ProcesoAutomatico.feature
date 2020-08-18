Feature: Cargue Periodico

  Background: El usuario prepara los archivos en la ruta parametrizada
    *En el archivo Web.config debe estar habilitada la opción EjecutarCarguePeriodico
    *Clientes, contratos, transacciones con la fecha del dia.
    *Las variables de migración deben coincidir con las columnas de los archivos

  Scenario: Ejecutar la carga de información por medio del proceso automatico
    Given El administrador entra la seccion proceso automatico
    When Ejecuta el proceso automatico
    Then Debe ver la información cargada
