package io_github_qaguru.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverProvider {

    public WebDriver get() {
        //для указания в каком браузере запускать тест
        final String browser = System.getProperty("browser");
        if ("chrome".equals(browser)) {
            return new ChromeDriver();
        }
        if ("firefox".equals(browser)) {
            return new FirefoxDriver();
        }
        throw new RuntimeException("No such browder: " + browser);
    }
}
