import java.util.Scanner;

public class printNumRecursion {
    static void printNaturalNum(int n){
        if(n == 1){
            System.out.println(n);
            return;
        }else {
            printNaturalNum(n - 1); // 1, 2, 3, 4......... n - 1
            System.out.println(n);
        }
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();
        printNaturalNum(n);
    }
}
