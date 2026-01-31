Feature: Compra en SauceDemo

  Scenario Outline: Compra exitosa con diferentes usuarios
    Given el usuario inicia sesion con "<user>" y "<password>"
    When realiza una compra de productos
    Then debe ver la confirmacion de compra

    Examples:
      | user          | password     |
      | standard_user | secret_sauce |
      | visual_user   | secret_sauce |
