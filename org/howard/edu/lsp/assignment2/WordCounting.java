/**
*  Name: Morayo Adeyemi
*/

//package org.howard.edu.lsp.assignment2;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class WordCounting {
    
    public static void main(String[] args) {
        // https://www.w3schools.com/java/java_files_read.asp
        try {
          File myObj = new File("org/howard/edu/lsp/assignment2/words.text");
          Scanner myReader = new Scanner(myObj);
          while (myReader.hasNextLine()) {
            String data = myReader.nextLine();
            System.out.println(data);
          }
          myReader.close();
        } catch (FileNotFoundException e) {
          System.out.println("An error occurred.");
          e.printStackTrace();
        }
      }
}
