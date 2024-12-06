

/**
 * Name: Morayo Adeyemi
 */
package org.howard.edu.lsp.finalexam.question1;

public class MathUtilsDriver {
    public static void main(String[] args) {
        MathUtils mathUtils = new MathUtils();

        // Factorial Tests
        System.out.println("Testing Factorial Method:");
        try {
            System.out.println("Factorial of 0: " + mathUtils.factorial(0)); // Expected: 1
            System.out.println("Factorial of 5: " + mathUtils.factorial(5)); // Expected: 120
            System.out.println("Factorial of -1: " + mathUtils.factorial(-1)); // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception for factorial(-1): " + e.getMessage());
        }

        // Prime Tests
        System.out.println("\nTesting isPrime Method:");
        System.out.println("Is 7 prime? " + mathUtils.isPrime(7)); // Expected: true
        System.out.println("Is 4 prime? " + mathUtils.isPrime(4)); // Expected: false
        System.out.println("Is 1 prime? " + mathUtils.isPrime(1)); // Expected: false
        System.out.println("Is 0 prime? " + mathUtils.isPrime(0)); // Expected: false
        System.out.println("Is -5 prime? " + mathUtils.isPrime(-5)); // Expected: false

        // GCD Tests
        System.out.println("GCD of 54 and 24: " + mathUtils.gcd(54, 24)); // Expected: 6
        System.out.println("GCD of 42 and 0: " + mathUtils.gcd(42, 0)); // Expected: 42
        System.out.println("GCD of 0 and 42: " + mathUtils.gcd(0, 42)); // Expected: 42
        System.out.println("\nTesting GCD Method:");
        try {
            
            System.out.println("GCD of 0 and 0: " + mathUtils.gcd(0, 0)); // Should throw exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception for gcd(0, 0): " + e.getMessage());
        }
        System.out.println("GCD of -25 and -10: " + mathUtils.gcd(-25, -10)); // Expected: 5
    }
}
