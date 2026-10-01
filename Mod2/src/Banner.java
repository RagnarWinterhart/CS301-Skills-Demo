public class Banner {
    public static void main(String[] args) {
        /*
        Write a program Banner.java that takes a string s from the command
        line and display it in banner style on the screen, moving from left
        to right and wrapping back to the beginning of the string as the end
        is reached. Add a second command-line argument to control the speed.
        Use the StdDraw library described in the textbook.
         */

        if (args.length < 2){
            System.err.println("Use: java Banner <s> <speed>");
            System.exit(1);
        }

        String s = args[0];
        double speed = Double.parseDouble(args[1]);
        double x = 0.0;
        double y = 0.5;
        StdDraw.enableDoubleBuffering();
        StdDraw.setScale(0.0, 1.0);
        while(true){
            // if the text is off the right of the window reset to start
            if (x > 1.0) {
                x = -.1; // resetting to 0.0 is a little jumpy so reset to
                        // slightly off-screen to make the transition smoother
            }
            StdDraw.clear();
            StdDraw.text(x, y, s);
            StdDraw.show();
            x = x + speed;
            StdDraw.pause(20);
        }
    }
}
