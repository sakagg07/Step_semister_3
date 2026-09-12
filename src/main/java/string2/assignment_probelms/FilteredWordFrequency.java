package string2.assigment_problems;

import java.util.*;

public class FilteredWordFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sentence: ");
        String sentence = sc.nextLine().toLowerCase();

        sentence = sentence.replace(".", "");
        sentence = sentence.replace(",", "");

        String[] words = sentence.split("\\s+");

        String[] stopWords = {"the", "was", "and", "a", "is", "of", "in"};

        HashMap<String, Integer> map = new HashMap<>();

        for (String word : words) {
            boolean stop = false;

            for (String stopWord : stopWords) {
                if (word.equals(stopWord)) {
                    stop = true;
                }
            }

            if (!stop) {
                map.put(word, map.getOrDefault(word, 0) + 1);
            }
        }

        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }
    }
}
