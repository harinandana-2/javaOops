import java.util.Scanner;

public class Stringmanipulation { 
    public static void main(String[] args) {
        String str="Hello world!";

        
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Lowercase: " + str.toLowerCase());
        System.out.println("Replace 'o' with '@': " + str.replace('o', '@'));
        System.out.println("Substring : " + str.substring(7, 12));
        boolean startsWith=str.startsWith("hello");
        System.out.println("Starts with 'hello' " + startsWith);
        boolean endsWith=str.endsWith("world!");
        System.out.println("Ends with 'world! ': " + endsWith);
        System.out.println("Trimmed string: '" + str.trim() + "'");

        
    }
}
