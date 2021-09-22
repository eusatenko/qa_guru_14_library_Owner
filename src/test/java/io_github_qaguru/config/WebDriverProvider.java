package io_github_qaguru.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverProvider {

    public WebDriver get() {
        //для указания в каком браузере запускать тест
        return new ChromeDriver();
        //return new FirefoxDriver();
    }
}
