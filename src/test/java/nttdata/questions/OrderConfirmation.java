package nttdata.questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import nttdata.userinterfaces.OverviewPage;

public class OrderConfirmation {

    public static Question<String> message() {
        return actor -> Text.of(OverviewPage.CONFIRMATION_MESSAGE).answeredBy(actor);
    }
}
