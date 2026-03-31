package netby.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class OverviewPage {

    public static final Target FINISH_BUTTON =
            Target.the("Finish button")
                    .located(By.id("finish"));

    public static final Target CONFIRMATION_MESSAGE =
            Target.the("Confirmation message")
                    .located(By.className("complete-header"));
}
