import java.util.LinkedHashMap;
import java.util.Map;

public class question1 {

    public static void main(String[] args) {

        String text = "This is a simple text. This text is simple.";

        // Convert text to lowercase
        text = text.toLowerCase();

        // Replace punctuation with spaces
        text = text.replaceAll("[^a-z\\s]", " ");

        // Remove extra spaces
        text = text.trim();

        // Check whether the text is empty
        if (text.isEmpty()) {
            System.out.println("No words found.");
            return;
        }

        // Split the text into individual words
        String[] words = text.split("\\s+");

        // Store each word and its frequency
        Map<String, Integer> wordCount = new LinkedHashMap<>();

        for (String word : words) {
            wordCount.put(
                word,
                wordCount.getOrDefault(word, 0) + 1
            );
        }

        // Display the result
        System.out.println("Word Frequencies:");

        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(
                entry.getKey() + " : " + entry.getValue()
            );
        }
    }
}
