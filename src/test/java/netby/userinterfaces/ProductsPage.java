package netby.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage {

    public static final Target FIRST_PRODUCT =
            Target.the("first product add button")
                    .located(By.id("add-to-cart-sauce-labs-backpack"));

    public static final Target SECOND_PRODUCT =
            Target.the("second product add button")
                    .located(By.id("add-to-cart-sauce-labs-bike-light"));

    public static final Target CART =
            Target.the("shopping cart")
                    .located(By.className("shopping_cart_link"));
}
