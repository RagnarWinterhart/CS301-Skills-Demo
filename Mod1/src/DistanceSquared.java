import java.util.Scanner;

public class DistanceSquared {
    public static void main(String[] args) {
        /* two integer cmd line arg input
         * prints Euclidean distance between point (x,y)
         * and origin (0,0), but the result is squared
        */
        double originX = 0;
        double originY = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a real number value for x");
        double x = scanner.nextDouble();
        System.out.println("Please enter a real number value for y");
        double y = scanner.nextDouble();
        scanner.close();

        distance(x, y, originX, originY);
    }

    public static void distance(double x, double y,
                                double originX, double originY){
        double dx = originX - x; // calculate the deltas
        double dy = originY - y;

        double dist = Math.hypot(dx, dy); // take the hypotenuse
        double distSq = dist * dist; // square the result

        System.out.println("The Eculidean distance between point " +
                "(" + x + ", " + y + ") and the origin is: " + dist + " \nand that " +
                "distance squared is: " + distSq);

    }
}
