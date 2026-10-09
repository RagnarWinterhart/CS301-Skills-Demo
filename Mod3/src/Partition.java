public class Partition {
    public static void main(String[] args) {
        /*
        Write a program Partition.java that takes a positive integer
        N as a command-line argument and prints out all partitions of N.
        A partitionLinks to an external site. of N is a way to write N as
        a sum of positive integers. Two sums are considered the same if
        they only differ in the order of their constituent summands.
         */

        if(args.length < 1){
            System.err.println("Usage: Java Partition <n>");
            System.exit(1);
        }
        int n = Integer.parseInt(args[0]);
        uniqueSums(n, n, "");

    }

    public static void uniqueSums(int max, int remaining, String choice){
        if(remaining == 0){ //Base case
            StdOut.println(choice);
            return;
        }
        if(remaining < 0 || max <= 0){
            return;
        }

        uniqueSums(max, remaining - max, choice + max + " ");
        uniqueSums(max - 1, remaining, choice);
    }
}
