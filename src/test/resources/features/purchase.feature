Feature: Compra en SauceDemo

  Scenario: Compra exitosa
    Given el usuario inicia sesion
    When realiza una compra
    Then debe ver la confirmacion de compra
