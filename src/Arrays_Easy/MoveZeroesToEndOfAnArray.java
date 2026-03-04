package Arrays_Easy;


import java.util.*;
class MovingZeroes {

    public static int[] Solve(int[] arr, int n) {
        int[] temp = new int[n];
        int j=0;
           for (int i = 0; i < n; i++) {
               if (arr[i] != 0) {
                     temp[j] = arr[i];
                     j++;
            }
        }
        return temp;
    }
}

    public class MoveZeroesToEndOfAnArray {
        public static void main(String[] args) {
            int[] arr1 = {0, 3, 0, 3, 0, 7, 0, 0, 1, 2};
            int n = arr1.length;
            System.out.println(Arrays.toString(MovingZeroes.Solve(arr1, n)));
        }
    }


