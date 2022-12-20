//Count the number of digits in the given number n.
import java.util.Scanner;

public class count_number_of_digit {
    public static void main(String[] args) {
    System.out.println("Enter a Number: ");
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    int count = 0;
    while (n != 0){
    n = n / 10;
    count++;
    }
    System.out.println(count);
    }
}
