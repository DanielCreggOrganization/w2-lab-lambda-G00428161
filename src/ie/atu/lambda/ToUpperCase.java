package ie.atu.lambda;

// Implement the StringOperation interface in the ToUpperCase class
public class ToUpperCase implements StringOperation {
    @Override
    public String apply(String str) {
        return str.toUpperCase(); // Converts input to uppercase
    }
}
