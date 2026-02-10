package nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Checkout implements Task {

    private final String firstName;
    private final String lastName;
    private final String zipCode;

    public static final Target FIRST_NAME = Target.the("First Name").located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("Last Name").located(By.id("last-name"));
    public static final Target ZIP_CODE = Target.the("Zip Code").located(By.id("postal-code"));
    public static final Target CONTINUE_BUTTON = Target.the("Boton Continue").located(By.id("continue"));
    public static final Target FINISH_BUTTON = Target.the("Boton Finish").located(By.id("finish")); // <-- ESTE ES CLAVE

    public Checkout(String firstName, String lastName, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(FIRST_NAME),
                Enter.theValue(lastName).into(LAST_NAME),
                Enter.theValue(zipCode).into(ZIP_CODE),
                Click.on(CONTINUE_BUTTON),
                Click.on(FINISH_BUTTON)
        );
    }

    public static Checkout withPersonalInformation(String firstName, String lastName, String zipCode) {
        return instrumented(Checkout.class, firstName, lastName, zipCode);
    }
}