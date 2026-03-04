package Arrays_Medium;

// Two Pointer Problem

import java.util.Arrays;

/* Brute For Method
class Sort_0_1_2{
    public static int[] Steps_for_Sort(int[] arr,int n){
        int temp0=0,temp1=0;
        int[] temp = new int[n];
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                temp0++;
            }
            if(arr[i]==1){
                temp1++;
            }

            for(int j=0;j<temp0;j++){
                temp[j]=0;
            }
            for(int j=temp0;j<temp0+temp1;j++){
                temp[j]=1;
            }
            for(int j=temp1+temp0;j<n;j++){
                temp[j]=2;
            }
        }
        return temp;
    }
}
public class SortArrayOfZero_Ones_Two {
    public static void main(String[] args) {
        int[] arr1={0,0,0,1,1,2,1,2};
        int n=arr1.length;
        int[] ans=Sort_0_1_2.Steps_for_Sort(arr1,n);
        System.out.println(Arrays.toString(ans));
    }
}

 */
