package br.com.jussara.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getUsernameField() {
        return driver.findElement(By.id("user-name"));
    }

    public WebElement getPasswordField() {
        return driver.findElement(By.id("password"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.id("login-button"));
    }

    public void loginWithValidCredentials() {
        getUsernameField().sendKeys("standard_user");
        getPasswordField().sendKeys("secret_sauce");
        getLoginButton().click();
    }

    public void loginWithInvalidCredentials() {
        getUsernameField().sendKeys("invalid_user");
        getPasswordField().sendKeys("wrong_password");
        getLoginButton().click();
    }
}
