// Find the sum of the following series
import java.util.Scanner;

public class sum_of_series {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = scn.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++){
            if(i % 2 == 0){
                sum -= i;
            }else{
                sum += i;
            }
        }
            System.out.print(sum);
    }

}
