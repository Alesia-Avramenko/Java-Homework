package mts.by;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FirstTest extends WebDriverSettings {

    @Test
    public void testNameBlockText() {
        String xpath = "//*[@class='pay']/div/h2[text()='Онлайн пополнение '][text()='без комиссии']";

        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))));
        Assert.assertEquals(element.getText(), "Онлайн пополнение\n" +
                "без комиссии");
        System.out.println("соответствует");
    }

    @Test
    public void testPaymentLogos() {

        List<String> expectedLogos = Arrays.asList("visa", "visa-verified", "mastercard", "mastercard-secure", "belkart");
        List<WebElement> logoElements = driver.findElements(By.xpath("//*[@class='pay__partners']//img[@alt]"));


        System.out.println("Проверка логотипов платежных систем:");

        for (String expectedLogo : expectedLogos) {
            boolean found = false;
            for (WebElement logoElement : logoElements) {
                String logoSrc = logoElement.getAttribute("src");
                if (logoSrc.toLowerCase().contains(expectedLogo)) {
                    found = true;
                    System.out.println(" Логотип '" + expectedLogo + "' найден");
                    break;
                }
            }
            if (!found) {
                System.out.println(" Логотип '" + expectedLogo + "' не найден");
            }
            Assert.assertTrue("Логотип '" + expectedLogo + "' не найден", found);
        }
    }

    @Test

    public void testCurrentUrl() {

        WebElement linkElement = driver.findElement(By.xpath("//a[.//text()[contains(., 'Подробнее о сервисе')]]"));
        assert linkElement != null;

        TestSettings.clickElement(driver, linkElement);


        String expectedUrl = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String currentUrl = driver.getCurrentUrl();
        assert currentUrl.equals(expectedUrl);

        System.out.println("Ссылка работает, открылась страница: " + driver.getCurrentUrl());


    }

    @Test

    public void testBattonContinue() throws InterruptedException {
        WebElement servicesDropdown = driver.findElement(By.xpath("//*[(@class='select__header')]"));
        servicesDropdown.click();

        WebElement serviceOption = driver.findElement(By.xpath("//option[@value='Услуги связи']"));
        serviceOption.click();

        WebElement phoneInput = driver.findElement(By.xpath("//input[@class='phone' and @id='connection-phone']"));
        phoneInput.sendKeys("297777777");

        WebElement totalRubInput = driver.findElement(By.xpath("//*[@class='total_rub'] [@id=\"connection-sum\"]"));
        totalRubInput.clear();
        totalRubInput.sendKeys("10");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement continueButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class= 'button button__default '][text()='Продолжить']")));
        TestSettings.clickElement(driver, continueButton);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement iframeElement = driver.findElement(By.xpath("//*[contains(@class, 'bepaid-iframe')]"));
        new WebDriverWait(driver, Duration.ofSeconds(10)).
                until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeElement));

        Thread.sleep(3000);

        System.out.println("Поля заполнены, переход по кнопке корректен");


    }

}