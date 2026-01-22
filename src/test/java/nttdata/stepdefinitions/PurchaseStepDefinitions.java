package nttdata.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

public class PurchaseStepDefinitions {

    private WebDriver driver;

    @Given("el usuario inicia sesion")
    public void el_usuario_inicia_sesion() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        // Lógica de login
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
    }

    @When("realiza una compra")
    public void realiza_una_compra() {
        // Agregar dos productos
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();
        driver.findElement(By.xpath("(//button[text()='Add to cart'])[1]")).click();

        // Ir al carrito
        driver.findElement(By.className("shopping_cart_link")).click();

        // Checkout y Formulario
        driver.findElement(By.id("checkout")).click();
        driver.findElement(By.id("first-name")).sendKeys("Manuel");
        driver.findElement(By.id("last-name")).sendKeys("Tinajero");
        driver.findElement(By.id("postal-code")).sendKeys("12345");
        driver.findElement(By.id("continue")).click();

        // Finalizar
        driver.findElement(By.id("finish")).click();
    }

    @Then("debe ver la confirmacion de compra")
    public void debe_ver_la_confirmacion_de_compra() {
        String mensaje = driver.findElement(By.className("complete-header")).getText();
        Assert.assertEquals("THANK YOU FOR YOUR ORDER!", mensaje.toUpperCase());

        if (driver != null) {
            driver.quit();
        }
    }
}