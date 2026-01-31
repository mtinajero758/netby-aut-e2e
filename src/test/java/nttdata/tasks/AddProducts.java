package nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AddProducts implements Task {

    public static final Target PRODUCTO_1 = Target.the("Añadir Sauce Labs Backpack")
            .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target PRODUCTO_2 = Target.the("Añadir Sauce Labs Bolt T-Shirt")
            .located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));

    public static final Target CARRITO = Target.the("Icono del carrito")
            .located(By.className("shopping_cart_link"));

    // === AQUÍ ESTÁ EL BOTÓN DE CHECKOUT ===
    public static final Target BOTON_CHECKOUT = Target.the("Botón Checkout")
            .located(By.id("checkout"));

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PRODUCTO_1),
                Click.on(PRODUCTO_2),
                Click.on(CARRITO),
                Click.on(BOTON_CHECKOUT) // Hacemos clic para ir al formulario de datos
        );
    }

    public static AddProducts toCart() {
        return instrumented(AddProducts.class);
    }
}