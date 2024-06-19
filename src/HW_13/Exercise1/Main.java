package HW_13.Exercise1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String[] cityArray = {"Варшава", "Прага", "Питер", "Вильнюс", "Рига", "Москва", "Киев", "Минск", "Питер", "Витебск", "Борисполь", "Сочи", "Рига", "Будапешт"};
        List<String> cityList = WordCounter.convertArrayToList(cityArray);


        WordCounter.printUniqueWords(cityArray);
        WordCounter.printWordCount(cityArray);
    }
}
