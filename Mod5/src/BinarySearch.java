import java.util.Arrays;
import java.util.Random;
public class BinarySearch {
    /*
        Given an array a[] of N distinct integers (positive or negative) in
        ascending order. Devise an algorithm (hint: binary search!) to find
        an index i such that a[i] = i if such an index exists. Name this program
         BinarySearch.java.
         */
    public static void main(String[] args) {
        if(args.length < 1){
            System.err.println("Usage: java BinarySearch <n>");
            System.exit(1);
        }
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        Random rand = new Random();
        int current = rand.nextInt(19) - 9; //Generates starting value for array from -9 to 9

        for(int i = 0; i < n; i++){
            a[i] = current;
            current += rand.nextInt(4) + 1; //add 1-4 to current for the next array element
        }
        System.out.println(Arrays.toString(a));
        int result = binarySearch(a);
        if(result == -1){
            System.out.println("No matching index found.");
        }else{
            System.out.println("Matching index found at: " + result);
        }

    }
    public static int binarySearch(int[] a){
        int high = a.length -1; //Index bounds
        int low = 0;
        while(low <= high){
            int i = low + (high-low)/2; //index & value we are looking for also functioning as our mid
            if(a[i] == i){ //looking for an index where the value equals the index
                return i; //i.e. i = 3 a[3] = 3
            }else if(a[i] > i){
                high = i - 1;   // matches must be on the left
            }else{
                low = i + 1; //watches must be on the right
            }
        }
        return -1;
    }
}
