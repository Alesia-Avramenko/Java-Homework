package mts.by;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FirstTest extends WebDriverSettings {

    @Test
    public void testNameBlockText() {
        String xpath = "//*[@class='pay']/div/h2[text()='Онлайн пополнение '][text()='без комиссии']";

        WebElement element = (new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath))));
        assertEquals(element.getText(), "Онлайн пополнение\n" +
                "без комиссии");
        System.out.println("соответствует");
    }

    @Test
    public void testPaymentLogos() {

        List<WebElement> logoElements = driver.findElements(By.xpath("//div[@class='pay__partners']//img[@alt]"));
        List<String> expectedLogos = Arrays.asList("Visa", "Verified By Visa", "MasterCard", "MasterCard Secure Code", "Белкарт");

        System.out.println("Проверка логотипов платежных систем:");

        List<String> logoElementsNew = new ArrayList<>();

        for (WebElement payPartner : logoElements) {
            assertTrue(payPartner.isDisplayed());
            System.out.println("Логотип отображается: " + payPartner.getAttribute("alt"));
        }
        for (WebElement payPartner : logoElements) {
            logoElementsNew.add(payPartner.getAttribute("alt"));
        }
        assertEquals(expectedLogos, logoElementsNew);

        if (expectedLogos.equals(logoElementsNew)) {
            System.out.println("Логотипы соответствуют ожидаемым");
        } else {
            System.out.println("Логотипы не соответствуют ожидаемым");
        }
    }


    private static final String EXPECTED_URL = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";

    @Test
    public void testCurrentUrl() {
        WebElement linkElement = driver.findElement(By.xpath("//a[.//text()[contains(., 'Подробнее о сервисе')]]"));
        linkElement.click();

        String currentUrl = driver.getCurrentUrl();
        assertTrue("Открылась другая страница: " + currentUrl, currentUrl.equals(EXPECTED_URL));

        System.out.println("Ссылка работает, открылась страница: " + currentUrl);
    }

    @Test
    public void testBattonContinue() {
        driver.findElement(By.xpath("//*[(@class='select__header')]")).click();
        driver.findElement(By.xpath("//option[@value='Услуги связи']")).click();

        WebElement phoneInput = driver.findElement(By.xpath("//input[@class='phone' and @id='connection-phone']"));
        phoneInput.sendKeys("297777777");

        WebElement totalRubInput = driver.findElement(By.xpath("//*[@class='total_rub'] [@id=\"connection-sum\"]"));
        totalRubInput.clear();
        totalRubInput.sendKeys("10");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement continueButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class= 'button button__default '][text()='Продолжить']")));
        continueButton.click();

        WebElement iframeElement = driver.findElement(By.xpath("//*[contains(@class, 'bepaid-iframe')]"));
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(iframeElement));

        System.out.println("Поля заполнены, переход по кнопке корректен");
    }
}