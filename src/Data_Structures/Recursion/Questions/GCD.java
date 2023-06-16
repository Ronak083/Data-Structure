package Data_Structures.Recursion.Questions;

public class GCD {
    public static void main(String[] args) {
        GCD recursion = new GCD();
        var rec = recursion.gcd(6,8);
        System.out.println(rec);
    }
    public int gcd(int a, int b){
        if(b==0) return a;
        return gcd(b, a % b);
    }

}
