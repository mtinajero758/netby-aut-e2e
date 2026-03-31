package netby.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CheckoutCompletePage {

    public static final Target CONFIRMATION_MESSAGE = Target.the(
            "mensaje de confirmación de compra"
    ).located(By.className("complete-header"));
}
