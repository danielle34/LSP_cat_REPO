package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Implements random number generation using Java's built-in Random class.
 * https://thelinuxcode.com/java-random-nextint-method/ for positive
 */
public class BasicInRandomStrategy implements RandomNumberStrategy {
    private final Random random = new Random();

    /**
     * Generates a random positive integer using Java's built-in Random.
     *
     * @return a positive random integer.
     */
    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE) + 1; 
    }
}
