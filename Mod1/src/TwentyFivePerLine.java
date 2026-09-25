public class TwentyFivePerLine {
    public static void main(String[] args) {
        /*
        Write a program TwentyFivePerLine.java that, using one for loop
        and one if statement, prints the integers from
        1000 to 2000 with 25 integers per line. Hint: use the % operator.
         */
        for(int i = 1000; i <= 2000; i++){
            System.out.print(i + " "); // prints next int
            if((i - 1000 + 1 ) % 25 == 0){
                System.out.println(); // Starts new line once we hit 25 ints
                                        // on previous line
            }
        }
    }
}
