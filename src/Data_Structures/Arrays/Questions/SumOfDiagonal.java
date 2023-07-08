package Data_Structures.Arrays.Questions;

public class SumOfDiagonal {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(SumOfDiagonal(arr));
    }
    private static int SumOfDiagonal(int[][] arr){
        int sum = 0;
        if (arr.length != arr[0].length) return -1;
        for (int i =0;i<arr[0].length;i++){
            sum += arr[i][i];
        }
        return sum;
    }
}
