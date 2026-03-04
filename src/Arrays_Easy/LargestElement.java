package Arrays_Easy;

class Finding_Largest_Numbers {
    public static int Solution(int[] arr) {
        if (arr == null || arr.length == 0) {
            // Handle the empty array case, e.g., throw an exception or return a default value
            throw new IllegalArgumentException("Array cannot be null or empty");
        }
        int max = arr[0];

        for(int i=1;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }
}
public class LargestElement{
    public static void main(String[] args){
        int[] num= new int[]{3,3,6,1};
        int max=Finding_Largest_Numbers.Solution(num);
        System.out.println(max);
    }
}



