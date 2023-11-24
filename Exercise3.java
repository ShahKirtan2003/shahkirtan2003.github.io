// Create a Java Program which reads a CSV file and prints the top 3 repeated words in the file.

import java.io.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) throws FileNotFoundException{
        

        System.out.println("Hello, World! Its Kirtan here.\nTop 3 words in the file are:");
        Scanner input = new Scanner(new File("words.csv"));         
        HashMap<String, Integer> map = new LinkedHashMap<String, Integer>();
        
        while (input.hasNext()) {
            String word = input.next();
            word = word.substring(0, word.length()-1);
            // System.out.println(word); 
            if (map.containsKey(word)) {
                int count = map.get(word);
                map.put(word, count + 1);
            }
            else {
                map.put(word, 1);
            }
        }
        input.close();


        map.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).limit(3).forEach(k -> System.out.println(k.getKey()));

    }
}
