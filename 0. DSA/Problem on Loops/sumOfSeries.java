import java.util.Scanner;

public class sumOfSeries {
    public static void main(String[] args) {
        System.out.print("Enter A Number: ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int ans = 0;
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0){
                ans -= i;
            }else{
                ans += i;
            }
        }
        System.out.print("Sum of Series: " + ans);
    }
}
