package Data_Structures.Recursion.Questions;

public class Power {
    public static void main(String[] args) {
        Power recursion = new Power();
        var result = recursion.pow(5,0);
        System.out.println(result);
    }
    public int pow(int base, int expo){
        if(expo==0) return 1;
        return base * pow(base , expo-1);
    }
}
