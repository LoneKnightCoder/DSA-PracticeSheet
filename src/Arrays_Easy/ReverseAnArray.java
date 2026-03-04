package Arrays_Easy;

import java.util.Arrays;

class solving {
    public static int[] ReverseArray(int[] arr, int n) {
        if(n<2){
            System.out.println("-1");
        }
            int[] temp = new int[n];
            for (int i = 0; i < n; i++) {
                temp[i] = arr[n - i - 1];
            }
            return temp;
    }
}
public class ReverseAnArray {
    public static void main(String[] args) {
        int[] arr1={2,4,6,7,9,0};
        int n=arr1.length;
        System.out.println(Arrays.toString(solving.ReverseArray(arr1,n)));
    }
}
