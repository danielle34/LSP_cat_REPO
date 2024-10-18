package org.howard.edu.lsp.midterm.question2;

/**
 * The Calculator adds numbers if they are ints, doubles or storeed in a list.
 */
public class Calculator {
    
    /**
     * This method sums two ints.
     *
     * @param number1 the first integer
     * @param number2 the second integer
     * @return the sum of number1 and number2
     */
    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    /**
     * This method sums two double values.
     *
     * @param number1 the first double
     * @param number2 the second double
     * @return the sum of number1 and number2
     */
    public static double sum(double number1, double number2) {
        return number1 + number2;
    }

    /**
     * This method sums all elements in an array of ints.
     *
     * @param numbers an array of integers
     * @return the sum of all elements in the array
     */
    public static int sum(int[] numbers) {
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
