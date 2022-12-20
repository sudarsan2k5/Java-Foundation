//Write a program to print all natural numbers from n to 1 using recursion
import java.util.Scanner;

public class printNaturalNum {
    static void printDecreasing(int n){
        // Base case
        if(n == 1){
            System.out.print(1);
            return;
        }
        // Self works
        System.out.println(n);

        //recursive work
        printDecreasing(n - 1);
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Num: ");
        int n = scn.nextInt();
        printDecreasing(n);
    }
}
