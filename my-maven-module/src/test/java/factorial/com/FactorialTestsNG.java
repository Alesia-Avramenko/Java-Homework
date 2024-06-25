package factorial.com;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.math.BigInteger;


public class FactorialTestsNG {

    @Test
    public void testFactorialPositiveNumber() {
        Assert.assertEquals(Factorial.calculateFactorial(5), BigInteger.valueOf(120));
    }

    @Test
    public void testFactorialZero() {
        Assert.assertEquals(Factorial.calculateFactorial(0), BigInteger.ONE);
    }

    @Test
    public void testFactorialOne() {
        Assert.assertEquals(Factorial.calculateFactorial(1), BigInteger.ONE);
    }

    @Test
    public void testFactorialLargeNumber() {
        Assert.assertEquals(Factorial.calculateFactorial(100), new BigInteger("93326215443944152681699238856266700490715968264381621468592963895217599993229915608941463976156518286253697920827223758251185210916864000000000000000000000000"));
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialNegativeNumber() {
        Factorial.calculateFactorial(-3);
    }
}