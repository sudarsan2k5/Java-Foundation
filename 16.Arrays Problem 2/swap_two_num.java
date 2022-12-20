import java.util.Scanner;

public class swap_two_num {
    static void swap(int num1, int num2){

        System.out.print("Before Swap");
        System.out.println();
        System.out.print("num1: " + num1);
        System.out.println();
        System.out.print("Num2: " + num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println();
        System.out.print("After Swap: ");
        System.out.println();
        System.out.print("Num1: " + num1);
        System.out.println();
        System.out.print("Num2: " + num2);

    }
    public static void main(String[] args) {
        System.out.print("Enter Your Fist Num: ");
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        System.out.println("Enter Second Num: ");
        int num2 = scn.nextInt();

        swap(num1, num2);
    }
}
