package netby.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutOverviewPage {

    public static final Target FINISH_BUTTON = Target.the(
            "botón finalizar compra"
    ).located(By.id("finish"));
}
