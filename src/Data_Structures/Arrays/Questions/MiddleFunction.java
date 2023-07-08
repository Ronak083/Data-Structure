package Data_Structures.Arrays.Questions;
import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args) {
        int[] arr = {3, 4, 7, 5, 2};
        int[] arr2 = MF(arr);
        for (int i =0;i<arr2.length;i++){
            System.out.print(arr2[i] + " ");
        }
    }

    public static int[] MF(int[] arr) {
        return Arrays.copyOfRange(arr,1,arr.length-1);
    }

}
