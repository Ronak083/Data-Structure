package Data_Structures.Arrays.Questions;
import java.util.Arrays;

public class MiddleFunction {
    public static void main(String[] args) {

        int[] arr = {3, 4, 7, 5, 2};
        SDA.Traverse(MF(arr));
    }

    private static int[] MF(int[] arr) {
        return Arrays.copyOfRange(arr,1,arr.length-1);
    }

}
