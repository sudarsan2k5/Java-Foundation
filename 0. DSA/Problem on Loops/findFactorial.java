import java.util.Scanner;

public class findFactorial {
    public static void main(String[] args) {
        System.out.print("Enter A Number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fact = 1;
        for(int i = 0; i <= n; i++){
            fact += fact * i;
            System.out.println("Factorial of " + i + ":" + fact);
        }
    }
}
