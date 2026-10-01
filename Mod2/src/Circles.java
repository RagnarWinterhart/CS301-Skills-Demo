public class Circles {
    public static void main(String[] args) {
        /*Write a program Circles.java that draws filled
        circles of random size at random positions in
        the unit square, producing images like those below.
        Your program should take four command-line arguments:
        the number of circles, the probability that each circle is black,
        the minimum radius, and the maximum radius.
        Use the StdDraw library described in the textbook.
        Feel free to reference the library's documentation as necessary.
         */
        // Ensure all arguments are passed
        if (args.length < 4){
            System.err.println("Use: java Circles <numCircles> <blackProbability> <minRadius> <maxRadius>");
            System.exit(1);
        }

        int numCircles = Integer.parseInt(args[0]);
        double blackProbability = Double.parseDouble(args[1]);
        double minRadius = Double.parseDouble(args[2]);
        double maxRadius = Double.parseDouble(args[3]);
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(0.0, 1.0);

        // Loop to generate each circle
        for(int i = 0; i < numCircles; i++){
            double x = Math.random();
            double y = Math.random();

            double radius = minRadius + (Math.random() * (maxRadius - minRadius));

            // Determine colors
            if(Math.random() < blackProbability){
                StdDraw.setPenColor(StdDraw.BLACK);
            }else{
                StdDraw.setPenColor(StdDraw.WHITE);
            }
            StdDraw.filledCircle(x, y, radius);
        }
        StdDraw.show();
    }
}
