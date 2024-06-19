package HW_13.Exercise2;


public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Петров", "123-456-7890");
        phoneBook.add("Петров", "123-456-1236");
        phoneBook.add("Иванов", "987-654-3210");
        phoneBook.add("Остапьева", "555-555-5555");

        System.out.println("Phone Book:");

        phoneBook.printPhoneNumbersForSurname("Петров");
        phoneBook.printPhoneNumbersForSurname("Иванов");
        phoneBook.printPhoneNumbersForSurname("Остапенко", true);
    }
}