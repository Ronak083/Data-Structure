package Data_Structures.Arrays.Questions;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3} , {4,5,6}, {7,8,9}};
        RatateMatrix(arr);
        System.out.println(arr);
    }

    private static void RatateMatrix(int[][] arr) {
        //Transpose
        for(int i =0;i< arr.length;i++){
            for (int j = 0;j<i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //reverse
        for(int i =0;i < arr.length;i++){
            for(int j =0;j<arr.length/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
}
