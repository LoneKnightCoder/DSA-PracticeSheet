package Arrays_Easy;

/**
 * Brute Force Method
 class Solution {
 public static void getElements(int[] arr,int n){
 if (n == 0 || n == 1) {
 System.out.println("-1 -1 ");
 return;
 }
 Arrays.sort(arr);

 int small = arr[1];
 int large = arr[n - 2];


 System.out.println("Second smallest is " + small);
 System.out.println("Second largest is " + large);

 }


 }
 public class SecondLargestElement {
 public static void main(String[] args) {
 int[] arr = {2,5,9,3,4};
 int n=arr.length;

 Solution.getElements(arr, n);
 }
 }
 **/

// Optimized method
class solution{
    public static int secondSmallest(int[]arr,int n){
        if (arr == null || arr.length == 0) {
            // Handle the empty array case, e.g., throw an exception or return a default value
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int min=Integer.MAX_VALUE;
        int secondMin=Integer.MAX_VALUE;
        for(int i=0;i<n;i++) {
            if (arr[i] < min) {
                secondMin = min;
                min = arr[i];
            } else if (arr[i] < secondMin)
                secondMin = arr[i];

        } return secondMin;
    }
    public static int secondLargest(int[]arr,int n){
        if (arr == null || arr.length == 0) {
            // Handle the empty array case, e.g., throw an exception or return a default value
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int max=Integer.MIN_VALUE;
        int secondMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            } else if (arr[i]>secondMax)
                secondMax=arr[i];
        } return secondMax;
    }
}



public class SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr1 = {3, 7, 5, 8, 1, 9};
        int n = arr1.length;
        int sS = solution.secondSmallest(arr1, n);
        int sL = solution.secondLargest(arr1, n);
        System.out.println("Second smallest is " + sS);
        System.out.println("Second largest is " + sL);
    }
}
