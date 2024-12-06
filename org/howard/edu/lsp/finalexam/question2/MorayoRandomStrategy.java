package org.howard.edu.lsp.finalexam.question2;


/**
 * Implements random number generation that only returns multiples of 3.
 */
public class MorayoRandomStrategy implements RandomNumberStrategy {

    /**
     * Generates a random positive integer that is a multiple of 3 -Morayo's fav number.
     *
     * @return a random positive integer that is a multiple of 3.
     */
    @Override
    public int generateRandomNumber() {
        return (int) (Math.random() * Integer.MAX_VALUE / 3) * 3; // Ensures a multiple of 3.

    }
}
