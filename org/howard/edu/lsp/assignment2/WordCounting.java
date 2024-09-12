/**
*  Name: Morayo Adeyemi
*/
package org.howard.edu.lsp.assignment2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordCounting {

    // this method is from https://stackoverflow.com/questions/1102891/how-to-check-if-a-string-is-numeric-in-java
    public static boolean isNumeric(String str) { 
        try {  
          Double.parseDouble(str);  
          return true;
        } catch(NumberFormatException e){  
          return false;  
        }  
      }

    public static void main(String[] args) {

        // https://www.w3schools.com/java/java_files_read.asp
        try {
            ArrayList<String> words_list = new ArrayList<>();
            ArrayList<Integer> count_times = new ArrayList<>();

            File myObj = new File("org/howard/edu/lsp/assignment2/words.txt");
            
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNext()) {
                // String data = myReader.nextLine();
                // System.out.println(myReader.hasNext());
                String word = myReader.next();

                // had an error where if I had an ! or , or puctuation it would crash 
                word = word.replaceAll("[^a-zA-Z]", ""); 
                if (isNumeric(word)==false && word.length()>3) 
                {
                    word = word.toLowerCase();

                    if (words_list.contains(word)){
                        count_times.set(words_list.indexOf(word), count_times.get(words_list.indexOf(word))+1);
                    }
                    else{
                        words_list.add(word);
                        count_times.add(1);
                    }
                }

            }
            myReader.close();

            for (int i = 0; i < words_list.size(); i++) {
                System.out.println(words_list.get(i) +" "+ count_times.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("There is an error.");
        }
    }
}
