package HW_13.Exercise2;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PhoneBook {
    private Map<String, Set<String>> phoneBook;

    public PhoneBook() {
        this.phoneBook = new HashMap<>();
    }

    public void add(String surname, String phoneNumber) {
        Set<String> numbersForSurname = phoneBook.getOrDefault(surname, new HashSet<>());
        numbersForSurname.add(phoneNumber);
        phoneBook.put(surname, numbersForSurname);
    }


    public void add(String phoneNumber) {
        boolean found = false;
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {

        }

        if (!found) {
            boolean added = false;
            for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
                if (entry.getValue().add(phoneNumber)) {
                    added = true;
                    phoneBook.put(entry.getKey(), entry.getValue());
                    break;
                }
            }

            if (!added) {
                phoneBook.put("Неизвестная фамилия", new HashSet<>() {{
                    add(phoneNumber);
                }});
            }
        }
    }


    public Set<String> get(String surname) {
        return phoneBook.getOrDefault(surname, new HashSet<>());
    }

    public void printPhoneNumbersForSurname(String surname) {
        Set<String> numbers = get(surname);
        System.out.println("Фамилия: " + surname);

        if (numbers.isEmpty()) {
            System.out.println("Нет телефонных номеров для данной фамилии.");
        } else {
            System.out.println("Телефонные номера: " + String.join(", ", numbers));
        }
        System.out.println();
    }

    public void printPhoneNumbers(String phoneNumber) {
        boolean found = false;
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            if (entry.getValue().contains(phoneNumber)) {
                System.out.println("Телефонные номера: " + phoneNumber);
                System.out.println("Фамилия: " + entry.getKey());
            }
        }

        if (phoneBook.values().stream().noneMatch(numbers -> numbers.contains(phoneNumber))) {
            System.out.println("Номер " + phoneNumber + " не сохранен.");
        }

        System.out.println();
    }


    public void printAllPhoneNumbers() {
        System.out.println("Все телефонные номера в справочнике:");
        for (Map.Entry<String, Set<String>> entry : phoneBook.entrySet()) {
            System.out.println("Фамилия: " + entry.getKey() + ", Номера: " + String.join(", ", entry.getValue()));
        }
        System.out.println();
    }
}