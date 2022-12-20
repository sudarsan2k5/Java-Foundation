import java.util.Scanner;

public class swap_without_temp {

    static void swapWithoutTemp(int num1, int num2){
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.print(num1);
        System.out.print(num2);
    }
    public static void main(String[] args) {
        System.out.print("Enter First Num: ");
        Scanner scn = new Scanner(System.in);
        int num1 = scn.nextInt();
        System.out.println("Enter Second Num: ");
        int num2 = scn.nextInt();


        swapWithoutTemp(num1, num2);
    }
}
