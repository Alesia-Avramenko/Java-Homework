package mts.by;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WebDriverSettings {
    protected WebDriver driver;

    private WebDriverWait wait;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://mts.by/");

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        cookieButton();
    }


    public void cookieButton() {
        WebElement cookieButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='Принять']")));
        cookieButton.click();

        WebElement element = driver.findElement(By.xpath("//*[@class='pay']/div/h2[text()='Онлайн пополнение '][text()='без комиссии']"));
        TestSettings.scrollToElement(driver, element);

        System.out.println("Test started");
    }

    @After
    public void testClosed() {
        System.out.println("Test closed");
        driver.quit();
    }
}

