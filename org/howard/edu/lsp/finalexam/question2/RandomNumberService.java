package org.howard.edu.lsp.finalexam.question2;


/**
 * Singleton service for generating random numbers using specified strategies.
 * used https://www.geeksforgeeks.org/singleton-design-pattern-in-java/?
 * 
 */
public class RandomNumberService {
    private static RandomNumberService instance; // Static variable for the single instance
    private RandomNumberStrategy strategy;      // Strategy for random number generation

    /**
     * Private constructor to prevent instantiation from outside.
     */
    private RandomNumberService() {}

    /**
     * Retrieves the single instance of the service.
     *
     * @return the singleton instance of RandomNumberService.
     */
    public static RandomNumberService getInstance() {
        if (instance == null) {
            instance = new RandomNumberService();
        }
        return instance;
    }

    /**
     * Sets the strategy for random number generation.
     *
     * @param strategy the strategy to use.
     */
    public void setStrategy(RandomNumberStrategy strategy) {
        this.strategy = strategy;
    }

    /**
     * Generates a random number using the currently set strategy.
     *
     * @return a random number.
     * @throws IllegalStateException if no strategy is set.
     */
    public int generateRandomNumber() {
        if (strategy == null) {
            throw new IllegalStateException("No strategy set. Please set a strategy first.");
        }
        return strategy.generateRandomNumber();
    }
}
