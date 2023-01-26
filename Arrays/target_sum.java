import java.util.Scanner;

public class target_sum {
    static int targetSum(int trg, int[] arr){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == trg){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Array Length: ");
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter "+ n + " Elements: ");
            arr[i] = scn.nextInt();
        }
        System.out.print("Enter Target: ");
        int trg = scn.nextInt();
        int sum = targetSum(trg, arr);
        System.out.print(sum);

    }
}
