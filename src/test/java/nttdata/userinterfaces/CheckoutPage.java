package nttdata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutPage {

    public static final Target FIRST_NAME =
            Target.the("first name field")
                    .located(By.id("first-name"));

    public static final Target LAST_NAME =
            Target.the("last name field")
                    .located(By.id("last-name"));

    public static final Target POSTAL_CODE =
            Target.the("postal code field")
                    .located(By.id("postal-code"));

    public static final Target CONTINUE =
            Target.the("continue button")
                    .located(By.id("continue"));
}
