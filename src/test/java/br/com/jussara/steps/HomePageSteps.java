package br.com.jussara.steps;

import br.com.jussara.pages.HomePage;
import br.com.jussara.support.WebDriverFactory;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.*;

public class HomePageSteps {
    WebDriver driver = WebDriverFactory.getDriver();
    HomePage homePage = new HomePage(driver);

    @Then("I should see the products list")
    public void i_should_see_the_products_list() {
        assertTrue(homePage.getProductList().isDisplayed());
    }
}
