import java.util.Scanner;

public class reverse_of_a_number {
    public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a Num: ");
    int n = scn.nextInt();

    while(n != 0){
        int dig = n % 10;
        System.out.print(dig);
        n = n / 10;
    }
    }
}
