package Striver.Sorting;

public class InsertionSort {
    public static void sort(int[] arr){
        /*Select an element in each iteration from the unsorted array(using a loop).
Place it in its corresponding position in the sorted part and shift the remaining elements accordingly (using an inner loop and swapping).
The “inner while loop” basically shifts the elements using swapping.*/
        for (int i = 0;i<arr.length;i++){
            int j = i;

            while (j > 0 && arr[j-1] > arr[j]){
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;
            }
        }
        /*Time complexity: O(N2/2 + n/2) ~= O(N2), (where N = size of the array), for the worst, and average cases.
        Space Complexity: O(1)*/
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 9, 3, 6, 7};

        sort(arr);

        for (int j : arr) {
            System.out.print(j);
        }
    }
}
