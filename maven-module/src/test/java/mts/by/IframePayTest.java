package mts.by;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class IframePayTest extends ConfigurationsFramePage {


    private final WebDriver driver;

    IframePayTest(WebDriver driver) {
        super(driver);
        this.driver = driver;
    }

    @Test
    @DisplayName("Тестирование полей ввода для оплаты услуг связи")
    public void iframePayFieldsTest() {
        assertAll("Тестирование полей ввода для оплаты услуг связи",
                () -> assertEquals(sum + ".00 BYN", sumPay.getAttribute("innerHTML")),
                () -> assertEquals("Оплата: Услуги связи\nНомер:375" + phoneNumber, phonePay.getAttribute("innerHTML")),
                () -> assertEquals("Номер карты", cardNumber.getAttribute("innerHTML")),
                () -> assertEquals("Срок действия", validity.getAttribute("innerHTML")),
                () -> assertEquals("CVC", cvc.getAttribute("innerHTML")),
                () -> assertEquals("Имя держателя (как на карте)", nameCardHolder.getAttribute("innerHTML")),
                () -> assertEquals(" Оплатить  " + sum + ".00 BYN <!---->", sumButton.getAttribute("innerHTML"))
        );
    }

    @Test
    @DisplayName("Проверка наличия логотипов платёжных систем")
    public void iframePayLogoTest() {
        List<WebElement> payPartners = driver.findElements(By.xpath("//*[contains(@class, 'cards-brands ng-tns-c46-1')]//div/img"));
        List<String> payPartnersExpected = new ArrayList<>(Arrays.asList("https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/mastercard-system.svg", "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/visa-system.svg", "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/belkart-system.svg", "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/mir-system-ru.svg", "https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/maestro-system.svg"));
        List<String> payPartnersNew = new ArrayList<>();
        for (WebElement payPartner : payPartners) {
            payPartnersNew.add(payPartner.getAttribute("src"));
        }
        assertEquals(payPartnersExpected, payPartnersNew);
    }
}