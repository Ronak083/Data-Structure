package Striver.Sorting;

import java.util.ArrayList;

public class MergeSort {
    /*Merge Sort is a divide and conquers algorithm, it divides the given array into equal parts and then merges the 2 sorted parts.
There are 2 main functions :
merge(): This function is used to merge the 2 halves of the array. It assumes that both parts of the array are sorted and merges both of them.
mergeSort(): This function divides the array into 2 parts. low to mid and mid+1 to high where,*/
    public static void sort(int[] arr){
        mergeSort(arr, 0, arr.length-1);
    }

    /*In order to implement merge sort we need to first divide the given array into two halves. Now, if we carefully observe, we need not divide the array and create a separate array, but we will divide the array’s range into halves every time. For example, the given range of the array is 0 to 4(0-based indexing). Now on the first go, we will divide the range into half like (0+4)/2 = 2. So, the range of the left half will be 0 to 2 and for the right half, the range will be 3 to 4. Similarly, if the given range is low to high, the range for the two halves will be low to mid and mid+1 to high, where mid = (low+high)/2. This process will continue until the range size becomes.
So, in mergeSort(), we will divide the array around the middle index(rather than creating a separate array) by making the recursive call :
1. mergeSort(arr,low,mid)   [Left half of the array]
2. mergeSort(arr,mid+1,high)  [Right half of the array]
where low = leftmost index of the array, high = rightmost index of the array, and mid = middle index of the array.
Now, in order to complete the recursive function, we need to write the base case as well. We know from step 2.1, that our recursion ends when the array has only 1 element left. So, the leftmost index, low, and the rightmost index high become the same as they are pointing to a single element.*/
    private static void mergeSort(int[] arr, int low, int high) {
        if(low >= high ) return;
        
        int mid = (low + high)/2;
        
        mergeSort(arr, low , mid);
        mergeSort(arr, mid + 1, high);
        
        merge(arr, low, mid, high);
    }

    /*In the merge function, we will use a temp array to store the elements of the two sorted arrays after merging. Here, the range of the left array is low to mid and the range for the right half is mid+1 to high.
Now we will take two pointers left and right, where left starts from low and right starts from mid+1.
Using a while loop( while(left <= mid && right <= high)), we will select two elements, one from each half, and will consider the smallest one among the two. Then, we will insert the smallest element in the temp array.
After that, the left-out elements in both halves will be copied as it is into the temp array.
Now, we will just transfer the elements of the temp array to the range low to high in the original array. The pseudo code will look like the following:*/
    private static void merge(int[] arr, int low, int mid, int high) {
        ArrayList<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid + 1;

        //comparing each element from both halves
        while(left <= mid && right <= high){
            if (arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } else {
                temp.add(arr[right]);
                right++;
            }
        }

        //left out in left half
        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        //left out in left half
        while (right <= high) {
            temp.add(arr[right]);
            right++;
        }
        //transfering all element to temp arr
        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }

        //o(n log n) n recursive loop
        //o(n) for temp arr
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 8, 9, 3, 6, 7};

        sort(arr);
        //mergeSort(arr, low, high);

        for (int j : arr) {
            System.out.print(j);
        }
    }
}
