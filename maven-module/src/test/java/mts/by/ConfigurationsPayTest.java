package mts.by;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ConfigurationsPayTest extends WebDriverSettings{
    protected WebDriver driver;


    protected WebElement connectionPhoneNumber;
    protected WebElement connectionSum;
    protected WebElement connectionEmail;
    protected WebElement internetPhoneNumber;
    protected WebElement internetSum;
    protected WebElement internetEmail;
    protected WebElement instalmentScore;
    protected WebElement instalmentSum;
    protected WebElement instalmentEmail;
    protected WebElement arrearsScore;
    protected WebElement arrearsSum;
    protected WebElement arrearsEmail;

    private void initializePageElements() {

        connectionPhoneNumber = driver.findElement(By.xpath("//*[contains(@id, 'connection-phone')]"));
        connectionSum = driver.findElement(By.xpath("//*[contains(@id, 'connection-sum')]"));
        connectionEmail = driver.findElement(By.xpath("//*[contains(@id, 'connection-email')]"));
        internetPhoneNumber = driver.findElement(By.xpath("//*[contains(@id, 'internet-phone')]"));
        internetSum = driver.findElement(By.xpath("//*[contains(@id, 'internet-sum')]"));
        internetEmail = driver.findElement(By.xpath("//*[contains(@id, 'internet-email')]"));
        instalmentScore = driver.findElement(By.xpath("//*[contains(@id, 'score-instalment')]"));
        instalmentSum = driver.findElement(By.xpath("//*[contains(@id, 'instalment-sum')]"));
        instalmentEmail = driver.findElement(By.xpath("//*[contains(@id, 'instalment-email')]"));
        arrearsScore = driver.findElement(By.xpath("//*[contains(@id, 'score-arrears')]"));
        arrearsSum = driver.findElement(By.xpath("//*[contains(@id, 'arrears-sum')]"));
        arrearsEmail = driver.findElement(By.xpath("//*[contains(@id, 'arrears-email')]"));
    }
}