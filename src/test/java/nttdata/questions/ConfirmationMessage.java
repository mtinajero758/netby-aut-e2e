package nttdata.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ConfirmationMessage implements Question<String> {

    public static final Target COMPLETE_HEADER = Target.the("Mensaje de confirmación de compra")
            .located(By.xpath("//*[contains(text(),'Thank you for your order!')]"));

    @Override
    public String answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(COMPLETE_HEADER, isVisible()).forNoMoreThan(5).seconds()
        );
        return Text.of(COMPLETE_HEADER).answeredBy(actor);
    }

    public static ConfirmationMessage value() {
        return new ConfirmationMessage();
    }
}