package mts.by;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertAll;

public class MtsPayTest extends ConfigurationsPayTest {


    public MtsPayTest() {
        super();

    }

    @Test
    @DisplayName("Тестирование надписей в незаполненных полях для каждого варианта оплаты услуг")
    public void payBlockFieldsTest() {
        assertAll("Тестирование полей ввода для разных видов платежей",
                () -> assertEquals("Номер телефона", connectionPhoneNumber.getAttribute("placeholder")),
                () -> assertEquals("Сумма", connectionSum.getAttribute("placeholder")),
                () -> assertEquals("E-mail для отправки чека", connectionEmail.getAttribute("placeholder")),
                () -> assertEquals("Номер абонента", internetPhoneNumber.getAttribute("placeholder")),
                () -> assertEquals("Сумма", internetSum.getAttribute("placeholder")),
                () -> assertEquals("E-mail для отправки чека", internetEmail.getAttribute("placeholder")),
                () -> assertEquals("Номер счета на 44", instalmentScore.getAttribute("placeholder")),
                () -> assertEquals("Сумма", instalmentSum.getAttribute("placeholder")),
                () -> assertEquals("E-mail для отправки чека", instalmentEmail.getAttribute("placeholder")),
                () -> assertEquals("Номер счета на 2073", arrearsScore.getAttribute("placeholder")),
                () -> assertEquals("Сумма", arrearsSum.getAttribute("placeholder")),
                () -> assertEquals("E-mail для отправки чека", arrearsEmail.getAttribute("placeholder"))
        );
    }
}