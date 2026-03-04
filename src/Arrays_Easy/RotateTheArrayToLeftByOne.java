package Arrays_Easy;

/** Brute Force Method
 * class Soln{
 *     public static void Solve(int[] arr,int n){
 *         int[] temp=new int[n];
 *         temp[n-1]=arr[0];
 *         for(int i=1;i<n;i++){
 *             temp[i-1]=arr[i];
 *      }
 *         for(int i=0;i<n;i++){
 *             System.out.println(temp[i]);
 *         }
 *         System.out.println();
 *     }
 * }
 * public class RotateTheArrayToLeftByOne {
 *     public static void main(String[] args){
 *         int[] arr = {3,5,6,1,6};
 *         int n=5;
 *         Soln.Solve(arr,n);
 *     }
 * }
 */

// Optimized Method

class Soln{
    public static void Solve(int[] arr,int n){
        int temp=arr[0];
        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }
        arr[n-1]=temp;

    }
}
class RotateTheArrayToLeftByOne {
    public static void main(String [] args) {
        int[] nums = {1, 3, 4, 6, 2, 8};
        int n = nums.length;
        Soln.Solve(nums,n);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
