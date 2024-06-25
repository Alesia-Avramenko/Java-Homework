package factorial.com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

class FactorialJUnitTests {

    @Test
    public void testFactorialPositiveNumber() {
        Assertions.assertEquals(BigInteger.valueOf(120), Factorial.calculateFactorial(5));
    }

    @Test
    public void testFactorialZero() {
        Assertions.assertEquals(BigInteger.ONE, Factorial.calculateFactorial(0));
    }

    @Test
    public void testFactorialOne() {
        Assertions.assertEquals(BigInteger.ONE, Factorial.calculateFactorial(1));
    }

    @Test
    public void testFactorialLargeNumber() {
        Assertions.assertEquals(new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"), Factorial.calculateFactorial(100));
    }

    @Test
    void testFactorialNegativeNumber() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> Factorial.calculateFactorial(-3));
    }
}