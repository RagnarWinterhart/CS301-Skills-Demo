public class Triangle {
    public static void main(String[] args) {
        /*
        Write a static method areTriangular() that takes three double
        arguments and returns true if they could be the sides of a triangle
        (that is, none of them is greater than or equal to the sum of the other two).
         */
        if (args.length < 3){
            System.err.println("Use: java Triangle <a> <b> <c>");
            System.exit(1);
        }

        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        StdOut.println(areTriangular(a, b, c));

    }

    public static boolean areTriangular(double a, double b, double c){
        if(a <= 0 || b <= 0 || c <= 0) return false;
        return a < (b + c) && b < (a + c) && c < (a + b);
    }
}
