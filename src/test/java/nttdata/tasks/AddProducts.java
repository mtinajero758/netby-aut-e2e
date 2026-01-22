package nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.Tasks;

import nttdata.userinterfaces.ProductsPage;

public class AddProducts implements Task {

    public static AddProducts toTheCart() {
        return Tasks.instrumented(AddProducts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ProductsPage.FIRST_PRODUCT),
                Click.on(ProductsPage.SECOND_PRODUCT),
                Click.on(ProductsPage.CART)
        );
    }
}
