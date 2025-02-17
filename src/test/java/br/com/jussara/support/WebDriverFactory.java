package br.com.jussara.support;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverFactory {
    private static WebDriver driver;

    public static void main(String[] args) {
        // Inicializando o WebDriver
        WebDriver driver = getDriver();

        // Abertura de uma página para verificar se o Chrome foi iniciado corretamente
        driver.get("https://www.saucedemo.com/v1/");

        // Aguardar 10 segundos antes de fechar o navegador
        try {
            Thread.sleep(10000); // 10000 ms = 10 segundos
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Fechar o driver após o tempo de espera
        quitDriver();
    }

    // Método para obter a instância do WebDriver
    public static WebDriver getDriver() {
        if (driver == null) {
            // Definindo a propriedade do ChromeDriver
            System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        }
        return driver;
    }

    // Método para fechar o WebDriver
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();  // Fecha o navegador
            driver = null;  // Libera a referência para o WebDriver
        }
    }
}
