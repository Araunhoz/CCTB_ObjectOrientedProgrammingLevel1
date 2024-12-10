public class Calculator {
	
    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to multiply three integers
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    // Method to multiply two double numbers
    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calc = new Calculator();

        // Multiply two integers
        int result1 = calc.multiply(5, 6);
        System.out.println("Multiplication of 5 and 6: " + result1); // Expected: 30

        // Multiply three integers
        int result2 = calc.multiply(2, 3, 4);
        System.out.println("Multiplication of 2, 3, and 4: " + result2); // Expected: 24

        // Multiply two double numbers
        double result3 = calc.multiply(1.5, 2.5);
        System.out.println("Multiplication of 1.5 and 2.5: " + result3); // Expected: 3.75
    }
}
