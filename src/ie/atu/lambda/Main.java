package ie.atu.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        
        // Define a lambda to trim spaces from a string
        Function<String, String> trimSpaces = s -> s.trim();

        // Define a lambda to convert a string to lowercase
        Function<String, String> toLowerCase = s -> s.toLowerCase();

        // Combine the two lambdas using andThen
        Function<String, String> combinedOperation = trimSpaces.andThen(toLowerCase);

        // Apply the combined operation
        System.out.println("Result: " + combinedOperation.apply("  Hello World  "));
    }
}
