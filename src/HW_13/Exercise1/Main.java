package HW_13.Exercise1;

public class Main {
    public static void main(String[] args) {

        String[] cityArray = {"Варшава", "Прага", "Питер", "Вильнюс", "Рига", "Москва", "Киев", "Минск", "Питер", "Витебск", "Борисполь", "Сочи", "Рига", "Будапешт"};

        WordCounter.printUniqueWords(cityArray);
        WordCounter.printWordCount(cityArray);
    }
}