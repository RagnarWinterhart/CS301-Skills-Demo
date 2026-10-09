import java.util.Arrays;
import java.util.Random;

public class SAT {
    public static void main(String[] args) {
        /*
        A prominent northeastern university receives 20,000 student applications.
        Assume that the SAT scores of these individuals is normally distributed
        with mean 1200 and standard deviation 100. Suppose the university decides
        to admit the 5,000 students with the best SAT scores. Write a Java
        program named SAT.java to estimate the lowest score that will still be admitted.
         */

        int totalApps = 20000;
        int admitted = 5000;
        double mean = 1200.0;
        double stdDev = 100;

        double[] scores = new double[totalApps];
        Random rand = new Random();
        for(int i = 0; i < totalApps; i++){
            double delta = rand.nextGaussian();
            scores[i] = mean + delta * stdDev;
        }
        //Sort in ascending order
        Arrays.sort(scores);

        //Since top scores are at indexes 15000 to 19999
        //Subtract 5000 from 20000 to get the lowest in our admitted scores at index 15000
        int cutOffIndex = totalApps - admitted;
        double lowestAdmitted = scores[cutOffIndex];

        StdOut.print("Estimated lowest SAT score to be admitted: " + Math.round(lowestAdmitted));
    }
}
