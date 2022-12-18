import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Rows: ");
        int r = scn.nextInt();
        System.out.print("Enter Colomn: ");
        int c = scn.nextInt();

        for(int i = 1;  i <= r; i++){
            for(int j = 1; j <= c; j++){
                if(i == 1 || i == r ||j == 1 || j == c)
                    System.out.print("*");
                else
                    System.out.println(" ");
            }
            System.out.println();
        }
    }
}
