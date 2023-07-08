package Data_Structures.Arrays.Questions;

public class MaxProduct {

    public static void main(String[] args) {
        int[] arr = {7, 5, 3, 2, 7, 8};
        MaxProduct(arr);
    }

    public static void MaxProduct(int[] arr) {
        int max = 0;
        String pairs = "";

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] * arr[j] > max) {
                    max = arr[i] * arr[j];
                    pairs = arr[i] + "," + arr[j];
                }
            }
        }
        System.out.println(pairs + " that is " + max);
    }
}
