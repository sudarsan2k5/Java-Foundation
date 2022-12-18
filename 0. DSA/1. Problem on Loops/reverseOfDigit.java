import java.util.Scanner;

public class reverseOfDigit {
    public static void main(String[] args) {
        System.out.print("Enter A Number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0;
        while(n > 0){
           ans = (ans * 10 + n % 10);
          n = n / 10;
        }
        System.out.print("Reverse Of Number is: " + ans);
    }
}
