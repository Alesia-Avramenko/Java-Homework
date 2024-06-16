package HW_12;

public class DataException extends RuntimeException {
    public DataException(int arrayNumber, int cellNumber, String message) {
        super(String.format("Error in cell [%d][%d]: %s", arrayNumber, cellNumber, message));
    }
}