package Arrays_Easy;
/** Brute Force Method

class Solution {
    public static boolean isSorted(int[]arr,int n) {
        for(int i=0;i<n;i++){
            for(int j=i+1;i<n;j++) {
                if (arr[j] < arr[i])
                    return false;
            }
        }return true;
    }
}
public class CheckIfArrayIsSorted {
    public static void main(String[] args){
        int[] arr1={1,9,6,8,5,4,0};
        int n = arr1.length;

        boolean sortedArray=Solution.isSorted(arr1,n);
        System.out.print(sortedArray);
    }
}
**/
class Solution {
    // Function to check if the array is sorted
    public boolean isSorted(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1])  // If any element is smaller than the previous one, return false
                return false;
        }
        return true;  // Return true if the array is sorted
    }
}

public class CheckIfArrayIsSorted {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int n = arr1.length;
        Solution obj = new Solution();

        // Output result
        System.out.println(obj.isSorted(arr1, n) ? "True" : "False");
        //NOTE:- If we create a static class in isSorted() then there no need to create new object obj and
         //      directly call isSorted() class like Solution.isSorted(arr1,n)

    }
}


