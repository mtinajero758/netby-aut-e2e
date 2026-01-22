package nttdata.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CartPage {

    public static final Target CHECKOUT =
            Target.the("checkout button")
                    .located(By.id("checkout"));
}
