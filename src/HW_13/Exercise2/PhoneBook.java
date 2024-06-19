package HW_13.Exercise2;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class PhoneBook {
    private Map<String, List<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        List<String> numbersForSurname = phoneBook.getOrDefault(surname, new ArrayList<>());
        numbersForSurname.add(phoneNumber);
        phoneBook.put(surname, numbersForSurname);
    }

    public List<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new ArrayList<>());
    }

    public void printPhoneNumbersForSurname(String surname) {
        printPhoneNumbersForSurname(surname, true);
    }

    public void printPhoneNumbersForSurname(String surname, boolean added) {
        List<String> numbers = get(surname);
        System.out.println("Surnames: " + surname);

        if (!added) {
            System.out.println("Failed to add phone number for " + surname);
        }

        if (numbers.isEmpty()) {
            System.out.println("No phone numbers found.");
        } else {
            System.out.println("Phone Numbers: " + String.join(", ", numbers));
        }
        System.out.println();
    }
}