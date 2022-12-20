import java.util.Scanner;

class sum{
    int add (int a, int b){
        int ans = a + b;
        return ans;
    }
}
public class method_sum {
    public static void main(String[] args) {
        sum obj = new sum();
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
       int ans = obj.add(a, b);
        System.out.println("The Sum of Two Number: " + ans);
    }
}
