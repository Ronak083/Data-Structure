package Data_Structures.Arrays.Questions;

public class twoSum {
    public static void main(String[] args) {
        int[] arr = {3,32,6,4,3,2,7,8,9};
        System.out.println(twoSum(arr,10));

    }
    public static int[] twoSum(int[] arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == target) {
                    return new int[] {i, j};
                }
            }
        }
        throw new IllegalArgumentException("Not found");
    }
}
