package io_github_qaguru.config;

import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverProvider {

    private WebDriverConfig config;

    public WebDriverProvider() {
        this.config = ConfigFactory.create(WebDriverConfig.class, System.getProperties());
    }


    public WebDriver createDriver() {
        WebDriver driver = getDriver();
        driver.get(config.getBaseURL());
        return driver;
    }

    private WebDriver getDriver() {
        //для указания в каком браузере запускать тест
        final String browser = config.getBrowser();
        if ("chrome".equals(browser)) {
            return new ChromeDriver();
        }
        if ("firefox".equals(browser)) {
            return new FirefoxDriver();
        }
        throw new RuntimeException("No such browder: " + browser);
    }
}
