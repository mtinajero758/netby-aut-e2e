package nttdata.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import nttdata.userinterfaces.CartPage;
import nttdata.userinterfaces.CheckoutOverviewPage;

public class FinishPurchase implements Task {

    public static FinishPurchase complete() {
        return Tasks.instrumented(FinishPurchase.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(CheckoutOverviewPage.FINISH_BUTTON)
        );
    }
}
