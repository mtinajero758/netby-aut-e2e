package netby.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import netby.userinterfaces.CheckoutOverviewPage;

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
