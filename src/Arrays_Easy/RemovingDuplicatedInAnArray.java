package Arrays_Easy;
// Optimized Solution
class Solutions {
    public static int NoOfUniqueElements(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        int i = 1;
    for(int j = 1;j<arr.length;j++){
            if(arr[j]!=arr[j - 1]){
                arr[i]=arr[j];
                i++;
            }
        } return i;
    }
}
public class RemovingDuplicatedInAnArray {
    public static void main(String[] args) {
        int[] arr1 = new int[]{2, 2, 4, 4, 6, 6, 8, 9, 9};
        int newElements = Solutions.NoOfUniqueElements(arr1);
        System.out.println("array with unique elements is");
        for(int j=0;j<newElements;j++){
            System.out.println(arr1[j]+" ");
        }
        System.out.println();
    }
}


//If array is not sorted then:-
/**   public class SortAscending {
 *       public static void main(String[] args) {
 *           int[] arr = {50, 10, 25, 1, 17, 99, 33};
 *           // Sort the array in ascending order
 *           Arrays.sort(arr);
 *           // Print the sorted array
 *           System.out.println("Sorted array in ascending order: " + Arrays.toString(arr));
 *       }
 *   }
 */