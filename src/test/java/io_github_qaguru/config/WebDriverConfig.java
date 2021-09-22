package io_github_qaguru.config;

import org.aeonbits.owner.Config;
import org.openqa.selenium.chrome.ChromeDriver;

public interface WebDriverConfig extends Config{

    @Config.Key("browser")
    String getBrowser();

    @Config.Key("baseUrl")
    String getBaseURL();

}

