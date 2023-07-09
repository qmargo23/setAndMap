import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7, 10, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = List.of("hello", "world", "hello", "how are you", "world", "hello");

        System.out.println("2.6. Коллекции: сеты и мапы");
        printUnEvenNumber(nums);
        System.out.println("____________________________________");
        printEvenNumber(nums);
        System.out.println("____________________________________");
        task3(words);
        System.out.println("____________________________________");
        task4(words);
        System.out.println("____________________________________");
    }

    public static void printUnEvenNumber(List<Integer> nums) {
        System.out.println("Печать только нечетные числа в консоль");
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }

    public static void printEvenNumber(List<Integer> nums) {
        System.out.println("напечатать только четные числа без повторений в порядке возрастания");
        Set<Integer> set = new TreeSet<>();
        for (Integer num : nums) {
            if (num % 2 == 0) {
                set.add(num);
            }
        }
        System.out.println(set);
    }

    public static void task3(List<String> words) {
        System.out.println("Напечатать уникальные слова из списка слов, в котором могут встречаться дубли");
        Set<String> uniqWords = new TreeSet<>(words);
        System.out.println(uniqWords);
    }

    public static void task4(List<String> words) {
        System.out.println("Выводит в консоль количество дублей для каждого уникального слова. ");
        Map<String, Integer> wordByCount = new HashMap<>();
        for (String word : words) {
            if (wordByCount.containsKey(word)) {
                wordByCount.put(word, wordByCount.get(word) + 1);
            } else {
                wordByCount.put(word, 1);
            }
        }

        for (Map.Entry<String, Integer> entry : wordByCount.entrySet()) {
            if (entry.getValue() > 0) {
                System.out.println(entry);
            }
        }
    }
}
