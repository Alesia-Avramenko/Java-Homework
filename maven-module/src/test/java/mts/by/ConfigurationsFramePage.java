package mts.by;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ConfigurationsFramePage extends WebDriverSettings {
    protected WebDriver driver;
    protected static String sum;
    protected static String phoneNumber;
    public ConfigurationsFramePage(WebDriver driver) {
        super();
        this.driver = driver;
    }

    public void testData(String phoneNumber, String sum) {
        ConfigurationsFramePage.sum = sum;
        ConfigurationsFramePage.phoneNumber = phoneNumber;
        WebElement phoneInputField = driver.findElement(By.xpath("//*[contains(@id, 'connection-phone')]"));
        WebElement sumInputField = driver.findElement(By.xpath("//*[contains(@id, 'connection-sum')]"));
        WebElement continueButton = driver.findElement(By.xpath("//*[contains(@id, 'pay-connection')]/button"));
        phoneInputField.click();
        phoneInputField.sendKeys(phoneNumber);
        sumInputField.click();
        sumInputField.sendKeys(sum);
        continueButton.click();
        fillInForm();
    }

    protected WebElement sumPay = driver.findElement(By.xpath("//*[contains(@class, 'pay-description__cost')]/span[1]"));
    protected WebElement phonePay = driver.findElement(By.xpath("//*[contains(@class, 'pay-description__text')]/span[1]"));
    protected WebElement cardNumber = driver.findElement(By.xpath("//*[contains(@class, 'content ng-tns-c46-1')]/label[1]"));
    protected WebElement validity = driver.findElement(By.xpath("//*[contains(@class, 'content ng-tns-c46-4')]/label[1]"));
    protected WebElement cvc = driver.findElement(By.xpath("//*[contains(@class, 'content ng-tns-c46-5')]/label[1]"));
    protected WebElement nameCardHolder = driver.findElement(By.xpath("//*[contains(@class, 'content ng-tns-c46-3')]/label[1]"));
    protected WebElement sumButton = driver.findElement(By.xpath("//*[contains(@class, 'colored disabled')]"));


    public void fillInForm() {
        try {
            clickSelectOption("//*[(@class='select__header')]", "//option[@value='Услуги связи']");
            fillInPhoneNumber("297777777");
            clearAndFillInTotalRub("10");
            clickContinueButton();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void clickSelectOption(String selectLocator, String optionLocator) {
        WebElement selectElement = driver.findElement(By.xpath(selectLocator));
        selectElement.click();
        WebElement optionElement = driver.findElement(By.xpath(optionLocator));
        optionElement.click();
    }

    private void fillInPhoneNumber(String phoneNumber) {
        WebElement phoneInput = driver.findElement(By.xpath("//input[@class='phone' and @id='connection-phone']"));
        phoneInput.sendKeys(phoneNumber);
    }

    private void clearAndFillInTotalRub(String totalRub) {
        WebElement totalRubInput = driver.findElement(By.xpath("//*[@class='total_rub'] [@id=\"connection-sum\"]"));
        totalRubInput.clear();
        totalRubInput.sendKeys(totalRub);
    }

    private void clickContinueButton() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement continueButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@class= 'button button__default '][text()='Продолжить']")));
        continueButton.click();
    }
}