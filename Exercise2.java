// Exercise 2: 

// Create a basic Java Program that takes 10 strings as input and adds them to an ArrayList and HashSet. Also, create a HashMap by populating the words as key and frequency as the value in the map. Iterate the list, set and map and print the content of the collection.

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

class Exercise2 {

    public static void main(String[] args) {
        

        System.out.println("Hello World! Its kirtan here.\nEnter 10 strings: ");

        ArrayList<String> list = new ArrayList<String>();
        HashSet<String> set = new HashSet<String>();
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        
        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 10; i++) {
            String str = input.nextLine();
            list.add(str);
            set.add(str);
            if (map.containsKey(str)) {
                map.put(str, map.get(str) + 1);
            } else {
                map.put(str, 1);
            }
        }
        
        System.out.println("List Contains:");
        for (String str : list) {
            System.out.println(str);
        }
        
        System.out.println("Set Contains:");
        for (String str : set) {
            System.out.println(str);
        }
        
        System.out.println("Frequency of the words:");
        for (String str : map.keySet()) {
            System.out.println("Word = " + str + ", Frequency = " + map.get(str));
        }
        

        input.close();
    }
}
