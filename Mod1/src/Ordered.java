import java.util.Scanner;

public class Ordered {
    public static void main(String[] args) {
        /*
        Write a program Ordered.java that reads in three integer
        command line arguments, x, y, and z. Create a boolean variable b that
        is true if the three values are either in ascending or in descending
        order, and false otherwise. Print the variable b.
         */
        boolean b = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer for x: ");
        //checking for valid input and reprompt
        while(!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter an " +
                    "integer for x: ");
            scanner.next();
        }
        int x = scanner.nextInt();

        System.out.println("Please enter an integer for y: ");
        while(!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter an " +
                    "integer for y: ");
            scanner.next();
        }
        int y = scanner.nextInt();

        System.out.println("Please enter an integer for z: ");
        while(!scanner.hasNextInt()){
            System.out.println("Invalid input. Please enter an " +
                    "integer for z: ");
            scanner.next();
        }
        int z = scanner.nextInt();

        scanner.close();

        isAscending(x, y, z, b);
    }

    public static void isAscending(int x, int y, int z, boolean b){
        // only assigns b true if ascending or descending
        if ((x > y && y > z) || (x < y && y < z)){
            b = true;
        }
        System.out.println(b);
    }
}
