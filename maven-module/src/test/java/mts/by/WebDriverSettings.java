package mts.by;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebDriverSettings {
    protected WebDriver driver;


    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("http://mts.by/");

        WebElement cookieButton = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Принять']"))));
        TestSettings.clickElement(driver, cookieButton);

        WebElement element = driver.findElement(By.xpath("//*[@class='pay']/div/h2[text()='Онлайн пополнение '][text()='без комиссии']"));
        TestSettings.scrollToElement(driver, element);

        System.out.println("Test started");
    }

    @After
    public void testClosed() {
        System.out.println("Test closed");
        driver.quit();
    }

    public static class TestSettings {
        public static final int SCROLL_PAUSE_MILLIS = 1000;
        public static final int CLICK_PAUSE_MILLIS = 2000;

        public static void scrollToElement(WebDriver driver, WebElement element) {
            ((org.openqa.selenium.JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
            try {
                Thread.sleep(SCROLL_PAUSE_MILLIS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        public static void clickElement(WebDriver driver, WebElement element) {
            Actions actions = new Actions(driver);
            actions.moveToElement(element).click().perform();
            try {
                Thread.sleep(CLICK_PAUSE_MILLIS);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}