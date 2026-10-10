public class RecursiveBinarySearch {
    public static void main(String[] args) {
        /*
        Write a program named RecursiveBinarySearch.java that uses recursive
        binary search to determine whether a target value occurs in a
        sorted integer array. Your solution must use recursion and should
        repeatedly compare the target to the middle element of the current
        search range. Based on that comparison, recursively search either
        the left or right half of the array. Do not use a loop to
        search the array.

            numbers = {3, 8, 12, 17, 21, 35, 48}

            search(numbers, 17) → true
            search(numbers, 20) → false
         */
        int[] numbers = {3, 8, 12, 17, 21, 35, 48};
        int tar = 15;
        int left = 0;
        int right = numbers.length - 1;
        StdOut.print(search(numbers, tar, left, right));
    }
    public static boolean search(int[] numbers, int tar, int left, int right){
        int mid = (right + left) / 2; //base case
        if(tar == numbers[mid]) return true;
        if(left > right) return false;
        if(tar > numbers[mid]){ //recursive case
            return search(numbers, tar, mid + 1, right);
        }else{
            return search(numbers, tar, left, mid - 1);
        }
    }

}
