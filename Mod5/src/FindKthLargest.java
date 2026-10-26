import java.util.Arrays;
import java.util.Random;

public class FindKthLargest {
    private static final Random rand = new Random();
    /*
    Given an array of N elements, not necessarily in ascending order,
    devise an algorithm to find the kth largest one.
    It should run in O(N) time on random inputs. Name this program FindKthLargest.java.
     */
    public static void main(String[] args) {
        if(args.length < 2){
            System.err.println("Usage: java FindKthLargest <n> <k>");
            System.exit(1);
        }
        int n = Integer.parseInt(args[0]);
        int k = Integer.parseInt(args[1]);
        if(k < 1 || k > n){
            System.err.println("Please enter an integer for k between 1 and n.");
            System.exit(1);
        }
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = rand.nextInt(100);
        }
        int tar = arr.length - k;

        int results = quickSelect(arr, 0, arr.length-1, tar);
        System.out.println(Arrays.toString(arr));
        System.out.println("Kth largest: " + results);
    }

    public static int quickSelect(int[] arr, int low, int high, int tar){
        while(high >= low){
            int pivotIdx = partition(arr, low, high);
            if(tar == pivotIdx){
                return arr[pivotIdx];
            } else if (tar < pivotIdx) {
                high = pivotIdx - 1;
            }else{
                low = pivotIdx + 1;
            }
        }
        return -1;
    }


    public static int partition(int[] arr, int low, int high){
        int pivotIdx = low + rand.nextInt(high - low + 1);
        int pivot = arr[pivotIdx];

        int temp = arr[high];
        arr[high] = arr[pivotIdx];
        arr[pivotIdx] = temp;
        int store = low;
        for(int i = low; i < high; i++){
            if(arr[i] < pivot){
                temp = arr[i];
                arr[i] = arr[store];
                arr[store] = temp;
                store++;
            }
        }
        temp = arr[high];
        arr[high] = arr[store];
        arr[store] = temp;
        return store;
    }
}
