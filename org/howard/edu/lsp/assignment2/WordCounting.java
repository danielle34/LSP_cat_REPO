/**
*  Name: Morayo Adeyemi
*/
package org.howard.edu.lsp.assignment2;

import java.io.File; // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.ArrayList; // Import the Scanner class to read text files
import java.util.Scanner;

public class WordCounting {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        ArrayList<Integer> counts = new ArrayList<>();
        // https://www.w3schools.com/java/java_files_read.asp
        try {

            // ArrayList<String> words = new ArrayList<>();
            // ArrayList<Integer> counts = new ArrayList<>();

            File myObj = new File("org/howard/edu/lsp/assignment2/words.text");
            
            Scanner myReader = new Scanner(myObj);
            System.out.println("oo"+myReader);
            while (myReader.hasNextLine()) {
                // String data = myReader.nextLine();
                // System.out.println(myReader.hasNext());
                String word = myReader.next();
                System.out.println(word);

                if (words.contains(word)){
                    System.out.println("HEYY");
                }
                else{
                    System.out.println("NO");
                    words.add(word);
                }

              
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
