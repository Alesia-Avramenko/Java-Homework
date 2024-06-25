package factorial.com;


import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
    public static BigInteger calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Число должно быть неотрицательным");
        } else if (n == 0 || n == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        BigInteger result = calculateFactorial(number);
        System.out.println("Факториал числа " + number + " равен " + result);
    }
}