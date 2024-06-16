package HW_12;

import java.util.Arrays;

public class ArrayProcessing {

    private static void checkSize(String[][] arr) {
        if (arr == null || arr.length != 4) {
            throw new SizeException("Array size must be 4x4");
        }
        for (String[] arrayNumber : arr) {
            if (arrayNumber == null || arrayNumber.length != 4) {
                throw new SizeException("Array size must be 4x4");
            }
        }
    }

    public static int sumElements(String[][] arr) {
        checkSize(arr);
        return sumWithException(arr);
    }

    private static int sumWithException(String[][] arr) {
        checkSize(arr);
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new DataException(i, j, e.getMessage());
                }
            }
        }
        return sum;
    }
}