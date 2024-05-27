public class Lesson4 {
    public static void main(String[] args) {
        // 1
        printThreeWords();
        // 2
        checkSumSign();
        // 3
        printColor();
        // 4
        compareNumbers();
        // 5
        System.out.println(checkSum(1, 16));
        // 6
        checkNum(5);
        // 7
        System.out.println(checkNum1(-55));
        // 8
        numStr(5, "Вывожу строку");
        // 9
        int year = 2024;
        System.out.println("Год " + year + " является високосным? " + checkYear(year));
        // 10
        arrays();
        // 11
        emptyMass();
        // 12
        newMass();
        // 13
        sqareMass();
        newMass1(10, 5);


    }

    //   1
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //   2
    public static void checkSumSign() {
        int a = 12;
        int b = -99;

        int sum = a + b;


        if (sum >= 0) {
            System.out.println("Сумма положительна");
        } else {
            System.out.println("Сумма отрицательная");
        }


    }
    // 3

    public static void printColor() {
        int value = -100;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 && value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");

        }


    }
    // 4

    public static void compareNumbers() {
        int a = 5000;
        int b = 808;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }


    }
    // 5

    public static boolean checkSum(int a, int b) {

        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    // 6
    public static void checkNum(int num) {
        if (num >= 0) {
            System.out.println("Число " + num + " положительное или равно 0.");
        } else {
            System.out.println("Число " + num + " отрицательное.");
        }


    }

    // 7
    public static boolean checkNum1(int a) {

        return a < 0;
    }

    // 8
    public static void numStr(int count, String str) {
        for (int i = 0; i < count; i++) {
            System.out.println(str);
        }

    }

    // 9
    public static boolean checkYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;


        }
    }

    // 10
    public static void arrays() {
        int[] arr = new int[]{1, 0, 1, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }

    // 11
    public static void emptyMass() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    // 12
    public static void newMass() {
        int[] arr = new int[]{8, 17, 3, 9, 22, 4, 9, 1, -6, 7, 3, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    // 13

    public static void sqareMass() {
        int n = 5;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            matrix[i][i] = 1;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // 14

    public static void newMass1(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initialValue;
            System.out.println("result[" + i + "] = " + arr[i]);

        }
    }
}

