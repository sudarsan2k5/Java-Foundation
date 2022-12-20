// Find The total number of pairs in the Array whose sum is equal to the
// given value x.

// input:- 4 6 3 5 8 2
// output:- 2
// Target:- 7
import java.util.Scanner;

public class target_sum {
    static int pairSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                if(arr[i] + arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

        System.out.print("Enter" + n + "Elements: ");
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter Target Sum: ");
        int target = scn.nextByte();

        System.out.println(pairSum(arr, target));
    }
}
