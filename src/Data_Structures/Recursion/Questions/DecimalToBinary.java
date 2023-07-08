package Data_Structures.Recursion.Questions;

public class DecimalToBinary {


    public static void main(String[] args) {
        DecimalToBinary recursion = new DecimalToBinary();
        var rec = recursion.function(8);
        System.out.println(rec);
    }
    public int function(int n){
        if(n==1 || n==0 ) return n;
        return n%2 + 10*function(n/2);
    }
}
