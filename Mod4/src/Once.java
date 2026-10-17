import java.util.HashMap;
import java.util.Scanner;

public class Once {
    public static void main(String[] args) {
        /*
        Write a program, Once.java, that reads in a string and prints
        the first character that appears exactly
        once in the string. Ex: ABCDBADDAB -> C.
         */

        System.out.println("Please enter a string: ");
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        //Create an array of characters out of String text
        char[] arr = text.toCharArray();

        //Store each character as key and value as count
        HashMap<Character, Integer> once = new HashMap<>();
        for(char c : arr){
            once.put(c, once.getOrDefault(c, 0) + 1);
        }
        //Compare array of chars against map to find first with count of 1
        boolean found = false;
        for(char c : arr){
            if(once.get(c) == 1){
                System.out.println(c);
                found = true;
                break;
            }
        }
        if(!found) {
            System.out.println("No unique character found.");
        }
        input.close();
    }
}
