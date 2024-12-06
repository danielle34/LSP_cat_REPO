package org.howard.edu.lsp.finalexam.question2;


/**
 * Client program for RandomNumberService.
 */
public class RandomNumberClient {
    public static void main(String[] args) {
        RandomNumberService service = RandomNumberService.getInstance();

        // Use the baic Built-in strategy
        service.setStrategy(new BasicInRandomStrategy());
        System.out.println("Built-in Random Strategy: " + service.generateRandomNumber());

        
        // Use Morayo's multiples of 3 strategy
        service.setStrategy(new MorayoRandomStrategy());
        System.out.println("Morayo Random Strategy (Multiples of 3): " + service.generateRandomNumber());
    }
}
