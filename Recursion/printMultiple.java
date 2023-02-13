import java.util.Scanner;

public class printMultiple {
    static void printMult(int n, int k){
        // BASE CASE
        if(k == 0){
            return;
        }
        // RECURSIVE WORK
        printMult(n, k - 1);
        // SELF WORK
        System.out.println(n * k);
    }
    public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter Value of N: ");
    int n = scn.nextInt();
    System.out.print("Enter Value of K: ");
    int k = scn.nextInt();
    printMult(n, k);
    }
}
