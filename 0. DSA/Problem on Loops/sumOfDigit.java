import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args) {
        System.out.print("Enter A Number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n = n / 10;
        }
        System.out.print("The Sum of Digit: " + sum);
    }
}
