package netby.stepdefinitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import netby.tasks.Login;
import netby.tasks.AddProducts;
import netby.tasks.Checkout;
import netby.questions.ConfirmationMessage;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class PurchaseStepDefinitions {

    @Before
    public void setTheStage() {
        // Configura el escenario para usar actores [cite: 189]
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("el usuario inicia sesion con {string} y {string}")
    public void el_usuario_inicia_sesion_con_y(String usuario, String password) {
        theActorCalled("Manuel").attemptsTo(
                Open.url("https://www.saucedemo.com/"),
                Login.withCredentials(usuario, password)
        );
    }

    @When("realiza una compra de productos")
    public void realiza_una_compra_de_productos() {
        theActorInTheSpotlight().attemptsTo(
                AddProducts.toCart(),
                Checkout.withPersonalInformation("Manuel", "Tinajero", "12345")
        );
    }

    @Then("debe ver la confirmacion de compra")
    public void debe_ver_la_confirmacion_de_compra() {

        theActorInTheSpotlight().should(
                seeThat("El mensaje de agradecimiento",
                        ConfirmationMessage.value(),
                        equalTo("Thank you for your order!"))
        );
    }
}