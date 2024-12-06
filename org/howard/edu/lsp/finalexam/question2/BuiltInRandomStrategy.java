package org.howard.edu.lsp.finalexam.question2;

import java.util.Random;

/**
 * Implements random number generation using Java's built-in Random class.
 */
public class BuiltInRandomStrategy implements RandomNumberStrategy {
    private final Random random = new Random();

    /**
     * Generates a random positive integer using Java's built-in Random.
     *
     * @return a positive random integer.
     */
    @Override
    public int generateRandomNumber() {
        return random.nextInt(Integer.MAX_VALUE) + 1; // Ensures positive integers only.
    }
}
