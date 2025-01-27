package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        // Using a lambda expression to implement the StringOperation interface
        StringOperation toUpperCase = str -> str.toUpperCase();
        
        // Testing the lambda expression
        System.out.println("Result: " + toUpperCase.operate("hello world"));
    }
}
