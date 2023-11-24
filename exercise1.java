
// Create a basic Java Program that takes two strings as input and produces the following output.
// Print the length of the first string

// Print the length of the second string

// Print if the length matches or not

// Print if the two strings are the same


class Testcase {

    public String str1;
    public String str2;
    
}

class Exercise1 {
    public static void main(String[] args) {
        System.out.println("Hello, World! Its Kirtan here.\n\n");

        Testcase tc1 = new Testcase();
        Testcase tc2 = new Testcase();

        tc1.str1 = "kickdrum";
        tc1.str2 = "technologies";
        
        tc2.str1 = "kickdrum";
        tc2.str2 = "kickdrum";


        // first taetcase
        System.out.println("For the first testcase strings are " + tc1.str1 + " and " + tc1.str2);
        System.out.println("The length of the first string is " + tc1.str1.length());
        System.out.println("The length of the second string is " + tc1.str2.length());
        System.out.println("The length of the two strings is " + (tc1.str1.length() == tc1.str2.length() ? "same" : "not the same"));
        System.out.println("The two strings are " + (tc1.str1.equals(tc1.str2) ? "equal" : "not equal"));
        
        // second testcase
        System.out.println("\n \nFor the second testcase strings are " + tc2.str1 + " and " + tc2.str2);
        System.out.println("The length of the first string is " + tc2.str1.length());
        System.out.println("The length of the second string is " + tc2.str2.length());
        System.out.println("The length of the two strings is " + (tc2.str1.length() == tc2.str2.length() ? "same" : "not the same"));
        System.out.println("The two strings are " + (tc2.str1.equals(tc2.str2) ? "equal" : "not equal"));


        // second task



    }
}