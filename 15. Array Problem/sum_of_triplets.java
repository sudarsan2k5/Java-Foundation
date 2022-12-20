// Count the Number of triplets whose sum is equal to the given value x.
//input:- 1 4 5 6 3
// output:- 2
// target = 12
import java.util.Scanner;

public class sum_of_triplets {
    static int tripletSum(int[] arr, int target){
        int n = arr.length;
        int ans = 0;

        for(int i = 0; i < n; i++){
            for(int j = i + 1; j < n; j++){
                for(int k = j +1; k < n; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = scn.nextInt();
        int[] arr = new int[n];

    System.out.print("Enter "+ n + "Elenemts");
    for(int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
    }
    System.out.print("Enter Target Sum: ");
    int target = scn.nextInt();

    System.out.print(tripletSum(arr, target));
    }
}
