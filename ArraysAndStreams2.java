import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArraysAndStreams2 {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "Orange", "umbrella", "grape", "Eagle", "iguana", "kiwi");

        // Existing operations (if any)

        // Filter strings starting with a vowel (case-insensitive)
        List<String> vowelsList = strings.stream()
                .filter(s -> s.matches("(?i)^[aeiou].*"))
                .toList();
        System.out.println("Strings starting with a vowel: " + vowelsList);

        // Concatenate all strings separated by a comma
        String concatenated = String.join(", ", strings);
        System.out.println("Concatenated strings: " + concatenated);

        // Count strings with more than 5 characters (case-insensitive)
        long count = strings.stream()
                .filter(s -> s.length() > 5)
                .count();
        System.out.println("Count of strings with more than 5 characters: " + count);
    }
}
