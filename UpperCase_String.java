//1.1) program to map string into uppercase

import java.util.stream.Stream;
import java.util.List;
import java.util.stream.Collectors;

public class UpperCase_String {
    public static void main(String[] args) {
        // Create a stream of names
        Stream<String> names = Stream.of("aBc", "d", "ef");

        // Convert each string to uppercase using map and collect them into a list
        List<String> upperCaseNames = names.map(String::toUpperCase).collect(Collectors.toList());

        // Print the result
        System.out.println(upperCaseNames);
    }
}