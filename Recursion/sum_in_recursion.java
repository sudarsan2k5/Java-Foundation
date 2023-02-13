import java.util.Scanner;

public class sum_in_recursion {
    static int sod(int n){
        // Base Case
        if(n >= 0 && n <= 9){
            return n;
        }
        // Recoursec Work - small ans
        int smallAns = sod(n / 10);

        // Self Work
        int ans = smallAns + n % 10;
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Digit: ");
        int n = scn.nextInt();
        System.out.print(sod(n));
    }
}
