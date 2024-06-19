package HW_13.Exercise1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WordCounter {
    public static List<String> convertArrayToList(String[] array) {
        return Arrays.stream(array)
                .collect(Collectors.toList());
    }

    public static void printUniqueWords(String[] words) {
        Set<String> uniqueWords = new HashSet<>(convertArrayToList(words));
        System.out.println("Список уникальных слов: " + uniqueWords);
    }

    public static void printWordCount(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        System.out.println("Количество повторений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}