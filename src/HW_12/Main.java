package HW_12;

public class Main {
    public static void main(String[] args) {
        String[][] validArr = {
                {"1", "2", "3", "4"},
                {"5", "6", "8", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArr = {
                {"1", "2"},
                {"5", "6", "7"},
                {"9", "10", "11"}
        };

        String[][] invalidDataArr = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "An*"},
                {"13", "14", "15", "16"}
        };

        try {
            System.out.println("Sum of valid array: " + ArrayProcessing.sumElements(validArr));
        } catch (SizeException | DataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Sum of array with invalid size: " + ArrayProcessing.sumElements(invalidSizeArr));
        } catch (SizeException | DataException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Sum of array with invalid data: " + ArrayProcessing.sumElements(invalidDataArr));
        } catch (SizeException | DataException e) {
            System.out.println(e.getMessage());
        }
    }
}