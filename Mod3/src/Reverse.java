public class Reverse {
    public static void main(String[] args) {
        /*
        Write a program Reverse.java that
        takes a string and reverses it using recursion.
         */
        if (args.length < 1){
            System.err.println("Use: java Reverse <String>");
            System.exit(1);
        }

        String s = args[0];
        StdOut.print(reverseString(s, s.length() - 1));
    }

    public static String reverseString(String s, int index){
        if (index<0) return "";
        return s.charAt(index) + reverseString(s, index -1);
    }
}
