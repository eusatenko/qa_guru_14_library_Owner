package io_github_qaguru.owner;

import io_github_qaguru.config.WebDriverProvider;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebDriverTest {

    private final static String TITLE = "GitHub: Where the world builds software · GitHub";

    private  WebDriver driver = new WebDriverProvider().createDriver();

    @Test
    //открыть страницу и проверить TITLE
    public void testOpenGitHubPage() {

        assertEquals(TITLE, driver.getTitle());
        driver.quit();
        }
}
// Для запуска тестов в терминале с параметром browser и url
// ./gradlew clean test -Dbrowser=FIREFOX -DbaseUrl=https://github.com
// ./gradlew clean test -Dbrowser=CHROME -DbaseUrl=https://github.com