package Arrays_Easy;

import java.util.*;
/* Brute Force Method
 class soln{
   public static int[] Solve(int[] arr,int n,int k) {
        int[] temp=new int[n];
        n=arr.length;
        k = k % n;
        int j=0;
        for(int i=n-k;i<n;i++){
            temp[j++]=arr[i];
        }
        for(int i=0;i<n-k;i++) {
         temp[j++] = arr[i];
        }
        return temp;
    }
 }
 public class RotateArrayByKthElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1={2,5,7,8,9,0};
        int n=arr1.length;
        int k = sc.nextInt();
        int[] temp=soln.Solve(arr1,n,k);
         System.out.println(Arrays.toString(temp));
    }
}
*/

class soln {
    public static int[] ReverseArray(int[] arr, int n) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int[] temp = new int[n];
        int[] temp2 = new int[n];
        int[] temp3 = new int[n];
        for (int i = 0; i < n; i++) {
            temp[i] = arr[n-i-1];
        }
        temp2=temp;
        for (int i = 0; i <k+1; i++) {
            temp2[i] = arr[k-i];
        }
        temp3=temp2;
        for (int i = n-k-1; i <n; i++) {
            temp3[i+k] = arr[n-i-1];
        }

        return temp3;
    }
}

class Sol{
    public static void main(String[] args) {
        int[] arr1={2,4,6,7,9,0};
        int n=arr1.length;
        System.out.println(Arrays.toString(soln.ReverseArray(arr1,n)));
    }
}








