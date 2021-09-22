package io_github_qaguru.owner;

import io_github_qaguru.config.WebDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private final static String BASE_URL = "https://github.com";
    private final static String TITLE = "GitHub: Where the world builds software · GitHub";

    private  WebDriver driver = new WebDriverProvider().get();

    @Test
    public void testOpenGitHubPage() {
        driver.get(BASE_URL);
        assertEquals(TITLE, driver.getTitle());
        driver.quit();
        }
}
