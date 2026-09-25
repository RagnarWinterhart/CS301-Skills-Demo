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
        System.out.println("Please enter a real number value for x: ");
        //checking for valid, input and reprompt
        while(!scanner.hasNextDouble()){
            System.out.println("Invalid input. Please enter a " +
                    "valid real number for x: ");
            scanner.next();
        }
        double x = scanner.nextDouble();

        System.out.println("Please enter a real number value for y: ");
        while(!scanner.hasNextDouble()){
            System.out.println("Invalid input. Please enter a " +
                    "valid real number for y: ");
            scanner.next();
        }
        double y = scanner.nextDouble();

        scanner.close();
        distance(x, y, originX, originY);
    }

    public static void distance(double x, double y,
                                double originX, double originY){
        // calculate the delta x and y
        double dx = originX - x;
        double dy = originY - y;

        double dist = Math.hypot(dx, dy); // gives us the length
        double distSq = dist * dist; // kind of redundant, since Math.hypot takes
                                    // the sqrt, could do distSq = (dx*dx) + (dy*dy)

        System.out.println("The squared Eculidean distance between point " +
                "(" + x + ", " + y + ") and the origin is: " + distSq);

    }
}
