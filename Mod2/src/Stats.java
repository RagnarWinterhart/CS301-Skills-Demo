public class Stats {
    public static void main(String[] args) {
        /*
        Write a program Stats.java that takes an integer command-line
        argument n, reads n floating-point numbers from standard input,
        and prints their mean (average value) and sample standard deviation
        (square root of the sum of the squares of their differences from
        the average, divided by n−1).  Use the StdIn library described by the textbook.
         */
        if(args.length < 1){
            System.err.println("Please use Java Stats <n>");
            System.exit(1);
        }
        // read in n numbers into array and sum them
        int n = Integer.parseInt(args[0]);
        double[] numbers = new double[n];
        double sum = 0.0;
        for(int i = 0; i < n; i++){
            numbers[i] = StdIn.readDouble();
            sum += numbers[i];
        }

        double mean = sum / n;
        //calc the sum of the squares of their differences from the average
        double sumSqDiff = 0.0;
        for(int i = 0; i < n; i++){
            double diff = numbers[i] - mean;
            sumSqDiff += diff * diff;
        }
        double stdDev = Math.sqrt(sumSqDiff / (n-1));

        StdOut.println(mean);
        StdOut.println(sumSqDiff);
        StdOut.println(stdDev);

    }
}
