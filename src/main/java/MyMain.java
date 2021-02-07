import java.util.ArrayList;
import java.util.Arrays;
public class MyMain {

    // Wrapper method
    public static boolean isSorted(ArrayList<Integer> list) {
        return isSortedRec(list, 0);
    }

    // This recursive method checks if the array is sorted in 
    // non-decreasing order
    public static boolean isSortedRec(ArrayList<Integer> list, int i) {
        if(i>=list.size()-2){
            return list.get(i)<=list.get(i+1);
        }else if(list.get(i)<=list.get(i+1)){
            return isSortedRec(list, i+1);
        }else{
            return false;
        }
        
    }



     // Wrapper method
    public static boolean hasCountCopies(int[] arr, int x, int count) {
        return hasCountCopiesRec(arr, x, count, 0, 0);
    }

    // This recursive method checks if the array contains exactly
    // count copies of the integer x
    public static boolean hasCountCopiesRec(int[] arr, int x, int count, int counter, int i) {
        if(i>arr.length-1){
            return count==counter;
        }else if(arr[i]==x){
            return hasCountCopiesRec(arr, x, count, counter+1, i+1);
        }else{
            return hasCountCopiesRec(arr, x, count, counter, i+1);
        }
    }

    // Wrapper method
    public static boolean binarySearch(int[] arr, int num) {
        return binarySearchRec(arr, num, 0, arr.length-1);
    }

    // This recursive method calls binary search on the array
    public static boolean binarySearchRec(int[] arr, int num, int lowerBound, int upperBound) {        
        int mid = lowerBound+(upperBound-lowerBound)/2;
        if(arr[mid]==num){
            System.out.println(Arrays.toString(arr)+" and num ="+num);
            System.out.println("good!");
            return true;
        }else if(lowerBound==upperBound||lowerBound+1==upperBound){
            System.out.println(Arrays.toString(arr)+" and num ="+num);
            System.out.println("nope!");
            return false;
        }else if(num>arr[mid]){
            return binarySearchRec(arr, num, mid, upperBound);
        }else if(num<arr[mid]){
            return binarySearchRec(arr, num, lowerBound, mid);
        }else{
            System.out.println(Arrays.toString(arr)+" and num ="+num);
            System.out.println("nope!");
            return false;
        }
    }

    public static void main(String[] args) {
      
    }
}
