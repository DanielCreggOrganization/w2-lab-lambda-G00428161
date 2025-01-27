package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {

        // Create an instance of ToUpperCase
        StringOperation toUpperCase = new ToUpperCase();
        String result = toUpperCase.apply("hello, world!");

        // Print the result
        System.out.println(result);
    }
}
