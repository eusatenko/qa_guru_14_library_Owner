package io_github_qaguru.config;

import org.aeonbits.owner.Config;
import org.openqa.selenium.chrome.ChromeDriver;

public interface WebDriverConfig extends Config{

    @Config.Key("browser")
    @DefaultValue("CHROME")
    Browser getBrowser();

    @Config.Key("baseUrl")
    @DefaultValue("https://github.com")
    String getBaseURL();

}

