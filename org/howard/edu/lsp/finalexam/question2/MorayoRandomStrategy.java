package org.howard.edu.lsp.finalexam.question2;


/**
 * Implements random number generation that only returns multiples of 3.
 */
public class MorayoRandomStrategy implements RandomNumberStrategy {
    private int seed = 1;

    /**
     * Generates a random positive integer that is a multiple of 3.
     *
     * @return a random positive integer that is a multiple of 3.
     */
    @Override
    public int generateRandomNumber() {
        seed = (seed * 3) % Integer.MAX_VALUE;
        return seed == 0 ? 3 : seed; // Ensures a multiple of 3 is returned.
    }
}
