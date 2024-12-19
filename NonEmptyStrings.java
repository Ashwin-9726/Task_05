//1.2) program to check the string is empty or not in the list
import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class NonEmptyStrings {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter non-empty strings using a stream and collect them into a list
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> s != null && !s.isEmpty())
                .collect(Collectors.toList());

        // Print the non-empty strings
        System.out.println("Non-empty Strings: " + nonEmptyStrings);
    }
}