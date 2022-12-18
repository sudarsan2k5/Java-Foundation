import java.util.Scanner;

public class countNumberDigit {
    public static void main(String[] args) {
        System.out.print("Enter Number Of Digit: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int count = 0;
        while(n > 0){
            n = n / 10;
            count++;
        }
        System.out.print("Count Number Of Digit: " + count);
    }
}
