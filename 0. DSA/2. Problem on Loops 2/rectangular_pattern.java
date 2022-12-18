import java.util.Scanner;

public class rectangular_pattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int row = scn.nextInt();
        System.out.print("Enter Column: ");
        int clm = scn.nextInt();
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= clm; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
