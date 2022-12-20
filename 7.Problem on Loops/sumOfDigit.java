// Find the sum of digits in a given number n
import java.util.Scanner;

public class sumOfDigit {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();
        int num = n;

        int sum = 0;
        while(n != 0){
            sum += n % 10;
            n =  n / 10;
        }
        System.out.println("The Sum of " + num +" is: " + sum);
    }
}