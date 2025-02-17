package br.com.jussara.steps;

import br.com.jussara.pages.LoginPage;
import br.com.jussara.pages.HomePage;
import br.com.jussara.support.WebDriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.*;

public class LoginSteps {
    WebDriver driver = WebDriverFactory.getDriver();
    LoginPage loginPage = new LoginPage(driver);
    HomePage homePage = new HomePage(driver);

    @Given("I am on the login page")
    public void i_am_on_the_login_page() {
        driver.get("https://www.saucedemo.com/v1/");
    }

    @When("I enter valid credentials")
    public void i_enter_valid_credentials() {
        loginPage.loginWithValidCredentials();
    }

    @When("I enter invalid credentials")
    public void i_enter_invalid_credentials() {
        loginPage.loginWithInvalidCredentials();
    }

    @Then("I should be logged in and redirected to the homepage")
    public void i_should_be_logged_in_and_redirected_to_the_homepage() {
        WebElement productList = homePage.getProductList();
        assertTrue(productList.isDisplayed());
    }

    @Then("I should see an error message")
    public void i_should_see_an_error_message() {
        WebElement errorMessage = driver.findElement(By.xpath("//h3[@data-test='error']"));
        assertTrue(((org.openqa.selenium.WebElement) errorMessage).isDisplayed());
    }
}
