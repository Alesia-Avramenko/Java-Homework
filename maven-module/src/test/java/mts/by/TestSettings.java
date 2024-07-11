package mts.by;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TestSettings {

    public static void scrollToElement(WebDriver driver, WebElement element) {
        ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

}
